import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import '@shopify/polaris/build/esm/styles.css'; // 引入 Polaris 样式
import { AppProvider } from '@shopify/polaris'; // 引入 AppProvider

ReactDOM.render(
  <AppProvider
    i18n={{
      Polaris: {
        ResourceList: {
          sortingLabel: "Sort by",
          showing: "Showing",
          defaultItemPlural: "items",
          defaultItemSingular: "item",
        },
      },
    }}
  >
    <App />
  </AppProvider>,
  document.getElementById('root')
);
