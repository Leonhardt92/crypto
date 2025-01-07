create table cryptokind
(
    name     varchar(255) null,
    nameabbr varchar(255) null,
    image    varchar(255) null
);
INSERT INTO crypto.cryptokind (name, nameabbr, image) VALUES ('Bitcoin', 'BTC', 'btc.webp');
INSERT INTO crypto.cryptokind (name, nameabbr, image) VALUES ('Ethereum', 'ETH', 'eth.webp');
INSERT INTO crypto.cryptokind (name, nameabbr, image) VALUES ('Solana', 'SOL', 'sol.webp');
INSERT INTO crypto.cryptokind (name, nameabbr, image) VALUES ('Tether', 'USDT', 'usdt.webp');
INSERT INTO crypto.cryptokind (name, nameabbr, image) VALUES ('XRP', 'XRP', 'xrp.webp');

create table ticker
(
    instType    varchar(255)                       not null,
    instId      varchar(255)                       not null,
    last        varchar(255)                       null,
    lastSz      varchar(255)                       null,
    askPx       varchar(255)                       null,
    askSz       varchar(255)                       null,
    bidPx       varchar(255)                       null,
    bidSz       varchar(255)                       null,
    open24h     varchar(255)                       null,
    high24h     varchar(255)                       null,
    low24h      varchar(255)                       null,
    volCcy24h   varchar(255)                       null,
    vol24h      varchar(255)                       null,
    ts          datetime                           null,
    sodUtc0     varchar(255)                       null,
    sodUtc8     varchar(255)                       null,
    create_time datetime default CURRENT_TIMESTAMP null
);

