import {useEffect, useState} from "react";
import axios from "axios";
import SingleProduct from "../../pages/SingleProduct.jsx"; //changed to SingleProduct, bruh u fucking...........
//obviously, SingleProduct is another separate page for SINGLE PRODUCT, DUH......... u driving me nuts🥜🥜 bro 🤬
// because im fucking confused whats happening here, previous one

// thats FINALLY explains smth, nuts 🥜🥜
import Product from "./Product.jsx";
import {Card, Container, Pagination, SimpleGrid, Text} from "@mantine/core";
import ProductPlaceholder from "./ProductPlaceholder.jsx";
import {searchValue} from "../UI/Search.jsx";

const ProductsList = () => {
    let [products, setProducts] = useState([])
    const [searchBar, setSearchbar] = useState(searchValue)

    useEffect(() => {
        setSearchbar(searchValue)
    }, [searchValue])

    useEffect(() => {

        async function fetch() {
            const response = await axios.get("http://localhost:8080/api/products", {
                headers: {
                    'Content-Type': 'application/json',
                    'Access-Control-Allow-Origin': '*'
                }
            })
            products = setProducts(response.data)
        }
        fetch();
    }, [])

    console.log(products)
    const wrappedProducts = products.map((product) => [
        <Product
            id={product.id}
            key={product.id}
            title={product.title}
            buyPrice={product.buyPrice}
            description={product.description}
            pictureUrl={product.pictureUrl}
            rating={product.rating}
        />
    ])


    return (
        <Container fluid={true}>
            <SimpleGrid cols={4} spacing="xs" verticalSpacing="sm"       breakpoints={[
                { maxWidth: 'md', cols: 3, spacing: 'md' },
                { maxWidth: 'sm', cols: 2, spacing: 'sm' },
                { maxWidth: 'xs', cols: 1, spacing: 'sm' },
            ]}>
                <div><Text>{searchBar}</Text></div>
                {wrappedProducts}
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
                <ProductPlaceholder />
            </SimpleGrid>
            <Pagination total={20} grow mt='xl'/>
        </Container>
    );
}

export default ProductsList;