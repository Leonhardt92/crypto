import React, { useState, useEffect } from 'react';
import { Page, Card, TextField, TextStyle } from '@shopify/polaris';

export default function CryptoSelector() {
  const [searchValue, setSearchValue] = useState('');
  const [cryptoData, setCryptoData] = useState([]); // 更新为数组，用于存储多个加密货币数据

  const API_BASE_URL = process.env.REACT_APP_API_BASE_URL; // 从环境变量中读取 API 地址

  // 获取数据的函数
  const fetchData = async (searchQuery) => {
    try {
      const query = searchQuery ? `name=${searchQuery}` : ''; // 如果没有输入，传递空字符串
      const response = await fetch(`${API_BASE_URL}/selectByName?${query}`);
      
      if (response.ok) {
        const data = await response.json();
        setCryptoData(data); // 更新为接口返回的多个加密货币数据
      } else {
        console.error('数据请求失败:', response.statusText);
      }
    } catch (error) {
      console.error('发生错误:', error);
    }
  };

  useEffect(() => {
    fetchData(searchValue); // 初始化加载一次数据

    const interval = setInterval(() => {
      fetchData(searchValue); // 每隔3秒刷新一次数据
    }, 3000);

    return () => clearInterval(interval); // 清除定时器，防止内存泄漏
  }, [searchValue]); // 当搜索值发生变化时重新设置定时器

  const handleSearchChange = (value) => {
    setSearchValue(value);
  };

  return (
    <Page
      title={
        <div style={{ textAlign: 'center', width: '100%' }}>
          Choose Crypto
        </div>
      }
    >
      <Card>
        <div style={{ padding: '16px' }}>
          <TextField
            labelHidden
            placeholder="搜索"
            value={searchValue}
            onChange={handleSearchChange}
            autoComplete="off"
          />
        </div>
        <div style={{ padding: '16px' }}>
          {cryptoData.length > 0 ? (
            cryptoData.map((crypto) => (
              <div
                key={crypto.instId}
                style={{
                  display: 'flex',
                  alignItems: 'center',
                  justifyContent: 'space-between',
                  padding: '12px 16px',
                  borderBottom: '1px solid #E0E0E0',
                }}
              >
                <div style={{ display: 'flex', alignItems: 'center' }}>
                  {/* 动态加载图片 */}
                  <img
                    src={`/image/${crypto.image}`} // 动态拼接图片路径
                    alt={crypto.name}
                    style={{ width: '32px', height: '32px', marginRight: '12px' }}
                  />
                  <div>
                    <TextStyle variation="strong">{crypto.name}</TextStyle>
                    <div style={{ fontSize: '12px', color: '#666' }}>{crypto.nameabbr}</div>
                  </div>
                </div>
                <TextStyle variation="strong" style={{ fontSize: '14px' }}>
                  {crypto.last}
                </TextStyle>
              </div>
            ))
          ) : (
            <TextStyle variation="subdued">没有找到匹配的加密货币。</TextStyle>
          )}
        </div>
      </Card>
    </Page>
  );
}
