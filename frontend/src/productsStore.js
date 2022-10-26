const productsArray = [
    {
        id: "price_1LnUTFDM1jwCEz8OGoOSXiSM",
        title: "Expensive Book1",
        price: 134.99,
        borrowprice: 29.99
    },
    {
        id: "price_1LnUTxDM1jwCEz8OAqHYTwKQ",
        title: "Less Expensive Book2",
        price: 49.99,
        borrowprice: 6.99
    },
    {
        id: "price_1LnUUoDM1jwCEz8OvxIcJ7to",
        title: "Cheap Book3",
        price: 39.99,
        borrowprice: 5.99
    },
    {
        id: "price_1LnUTFDM1jwCEz8OGoOSXiSM-",
        title: "Expensive Book4",
        price: 134.99,
        borrowprice: 29.99
    },
    {
        id: "price_1LnUTxDM1jwCEz8OAqHYTwKQ-",
        title: "Less Expensive Book5",
        price: 49.99,
        borrowprice: 6.99
    },
    {
        id: "price_1LnUUoDM1jwCEz8OvxIcJ7to-",
        title: "Cheap Book6",
        price: 39.99,
        borrowprice: 5.99
    },   {
        id: "price_1LnUTFDM1jwCEz8OGoOSXiSM--",
        title: "Expensive Book1",
        price: 134.99,
        borrowprice: 29.99
    },
    {
        id: "price_1LnUTxDM1jwCEz8OAqHYTwKQ--",
        title: "Less Expensive Book2",
        price: 49.99,
        borrowprice: 6.99
    },
    {
        id: "price_1LnUUoDM1jwCEz8OvxIcJ7to--",
        title: "Cheap Book3",
        price: 39.99,
        borrowprice: 5.99
    },
    {
        id: "price_1LnUTFDM1jwCEz8OGoOSXiSM---",
        title: "Expensive Book4",
        price: 134.99,
        borrowprice: 29.99
    },
    {
        id: "price_1LnUTxDM1jwCEz8OAqHYTwKQ---",
        title: "Less Expensive Book5",
        price: 49.99,
        borrowprice: 6.99
    },
    {
        id: "price_1LnUUoDM1jwCEz8OvxIcJ7to---",
        title: "Cheap Book6",
        price: 39.99,
        borrowprice: 5.99
    }
];

function getProductData(id) {
    let productData = productsArray.find(product => product.id === id);

    if (productData == undefined) {
        console.log("Product data does not exist for ID: " + id);
        return undefined;
    }

    return productData;
}

export { productsArray, getProductData };