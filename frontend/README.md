

# Cryptocurrency Real-Time Quotation App

This is a web-based cryptocurrency real-time quotation app that fetches live market data and displays it to users with an intuitive UI. The application allows users to search for specific cryptocurrencies and view real-time quotes.

### **Tech Stack**
- **Frontend**: TypeScript, Shopify Polaris UI
- **Backend**: TypeScript (Node.js), Express.js
- **Database**: MongoDB (for storing app-related data)
- **Market Data**: Fetching live data from external API (e.g., CoinGecko, CoinMarketCap)

---

## **Features**
- Real-time cryptocurrency market data fetching.
- Search functionality for specific cryptocurrencies.
- Display real-time prices, volume, market cap, and other relevant data.
- Polished, modern UI using **Shopify Polaris UI** components.
- Database implementation for storing necessary application data.

---

## **Setup and Installation**

### 1. **Clone the repository**
```bash
git clone https://github.com/your-username/crypto-quotation-app.git
cd crypto-quotation-app
```

### 2. **Install Dependencies**
- First, install the dependencies for both the frontend and backend.
```bash
npm install
```

### 3. **Setting up the backend**
- Create a `.env` file in the root of the project to store environment variables such as your database URL and API keys for fetching market data.
- Ensure you have **Node.js** and **MongoDB** running locally or configure your MongoDB cluster in the `.env` file.

### 4. **Frontend Setup**
- The frontend uses **Shopify Polaris UI** to create a modern user interface. To install Polaris, run:
```bash
npm install @shopify/polaris @shopify/polaris-react
```
- You will also need **React** and **React DOM** installed:
```bash
npm install react react-dom
```

### 5. **Running the app**
To run the application in development mode, use:
```bash
npm run dev
```
This will start both the backend server and the frontend React app in development mode. Open your browser and navigate to `http://localhost:3000` to view the application.

---

## **How It Works**

1. **Live Market Data Fetching**:
   - The backend fetches live cryptocurrency market data from an external API (e.g., CoinGecko API).
   - The data is then sent to the frontend via API endpoints.

2. **UI Components**:
   - The frontend uses Shopify **Polaris UI** to display a clean and user-friendly interface, with features like a search bar, table view for cryptocurrency details, and real-time updates.

3. **Search Feature**:
   - Users can search for specific cryptocurrencies by name or symbol, and the results will be displayed dynamically.

4. **Data Storage**:
   - The database stores application-related data such as user preferences, search history, and any other necessary configurations for the app.

---

## **API Endpoints**

### 1. **GET /api/cryptocurrencies**
Fetches all available cryptocurrencies with their latest market data.

**Response Example**:
```json
[
  {
    "id": "bitcoin",
    "name": "Bitcoin",
    "symbol": "BTC",
    "price": "45000.00",
    "market_cap": "850000000000",
    "volume": "50000000000"
  },
  ...
]
```

### 2. **GET /api/cryptocurrencies/{id}**
Fetches detailed data for a specific cryptocurrency by its ID.

**Response Example**:
```json
{
  "id": "bitcoin",
  "name": "Bitcoin",
  "symbol": "BTC",
  "price": "45000.00",
  "market_cap": "850000000000",
  "volume": "50000000000",
  "change_24h": "2.3%"
}
```

### 3. **GET /api/search?query={searchTerm}**
Searches for cryptocurrencies based on the search term provided.

---

## **Development Notes**

### Backend
- The backend is built using **Express.js** and serves as the API provider for fetching and serving real-time cryptocurrency market data.
- **MongoDB** is used to store application-related data, including user preferences and search history.

### Frontend
- The frontend uses **React** and **Shopify Polaris UI** for building the UI components. Polaris ensures the app has a polished and professional look.
- **Axios** is used for making API requests to the backend.

---

## **Future Enhancements**
- Implement user authentication to save preferences and data.
- Add more detailed charts and data analysis.
- Optimize performance for handling large datasets.
- Enable multi-language support for broader accessibility.

---

## **License**
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### **Contributions**
Feel free to fork this project, make contributions, and open pull requests to improve the app. Please ensure that your code follows the coding conventions and is thoroughly tested before submitting.

--- 

### **Contact**
For any inquiries, feel free to open an issue in the GitHub repository or contact me at:  
**Email**: your-email@example.com  
**GitHub**: [Your GitHub Profile](https://github.com/your-username)

---

This README outlines the steps to get the app up and running locally and details the functionality and structure of the project.