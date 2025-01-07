package com.demo.dao;

import com.demo.model.OkxTickers;
import com.demo.model.TickerVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface TickerDao {
    @Insert("INSERT INTO ticker (instType, instId, last, lastSz, askPx, askSz, bidPx, bidSz, open24h, high24h, low24h, volCcy24h, vol24h, ts, sodUtc0, sodUtc8) " +
            "VALUES (#{instType}, #{instId}, #{last}, #{lastSz}, #{askPx}, #{askSz}, #{bidPx}, #{bidSz}, #{open24h}, #{high24h}, #{low24h}, #{volCcy24h}, #{vol24h}, #{ts}, #{sodUtc0}, #{sodUtc8})")
    int insert(OkxTickers.DataDTO ticker);

    @Select("<script>" +
            "select c.name, c.nameabbr, c.image, t.last\n" +
            "from cryptokind c\n" +
            "inner join ticker t on concat(c.nameabbr,'-USD')=t.instId and t.create_time=(select max(create_time) from ticker)" +
            "<where>" +
            "<if test='name != null and name != \"\"'>AND (LOWER(c.name) LIKE CONCAT('%', LOWER(#{name}), '%') or LOWER(c.nameabbr) LIKE CONCAT('%', LOWER(#{name}), '%'))</if>" +
            "</where>" +
            "</script>")
    List<TickerVo> selectByInstId(TickerVo dataDTO);

}
