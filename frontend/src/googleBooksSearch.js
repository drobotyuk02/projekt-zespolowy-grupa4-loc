import React, { useState } from "react";  
import axios from 'axios';  
//import { Card } from 'react-bootstrap';  
import NavbarComponent from './components/Navbar';
import { createStyles, SimpleGrid, Card, Image, Text, Container, AspectRatio } from '@mantine/core';
import './App.css';

const useStyles = createStyles((theme) => ({
    card: {
      transition: 'transform 150ms ease, box-shadow 150ms ease',
  
      '&:hover': {
        transform: 'scale(1.01)',
        boxShadow: theme.shadows.md,
      },
    },
  
    title: {
      fontFamily: `Greycliff CF, ${theme.fontFamily}`,
      fontWeight: 600,
    },
  }));

function GoogleBooksSearch() {  
    const { classes } = useStyles();
    const [book, setBook] = useState("");  
    const [result, setResult] = useState([]);  
    const [apiKey, setApiKey] = useState("AIzaSyDtzZSStIm_x5mFwzUpj2kR2vd47O6550A");
  
    function handleChange(event) {  
        const book = event.target.value;  
        setBook(book);  
    }  

    function handleSubmit(event) {  
        event.preventDefault();  
        ///axios.get("https://www.googleapis.com/books/v1/volumes?q=" + book + "&key=" + apiKey + "&maxResults=40")  
        axios.get("https://www.googleapis.com/books/v1/volumes?q=" + book)     
        .then(data => {  
                console.log(data.data.items);  
                setResult(data.data.items);  
            })  
    }  
{/* <Card.Img style = {{maxHeight:"200px"}} variant="top" src={}  />  
                                <Card.Body>  
                                    <h5 className="card-title">Card title</h5>  
                                    <a href = {book.volumeInfo.canonicalVolumeLink}className="btn btn-primary">Know more</a>  
                                </Card.Body>   
                            <Card key={article.title} style={{ 'marginTop': '10px'}} p="md" radius="md" component="a" className={classes.card}>  */}
    return ( 
        <form onSubmit={handleSubmit}>    
            <NavbarComponent></NavbarComponent>
            <div className="card-header main-search">  
                <div className="row" >  
                    <div className="col-12 col-md-3 col-xl-3" >  
                        <input onChange={handleChange} className="AutoFocus form-control" placeholder="Type something..." type="text" />  
                    </div>  
                    <div className="ml-auto">  
                        <input type="submit" value="Search" className="btn btn-primary search-btn" />  
                    </div>  
                </div>  
            </div>
            <div className="container">  
                <div className="row">  
                    {result.map(book => (  
                        <div className="col-sm-3">  
                                <Card href = {book.volumeInfo.canonicalVolumeLink} style={{ 'marginTop': '10px'}} p="md" radius="md" component="a" className={classes.card}>  
                                    <AspectRatio ratio={1920 / 1080}>
                                        <Image src={book.volumeInfo.imageLinks !== undefined ? book.volumeInfo.imageLinks.thumbnail : ''} alt={book.title}/>
                                    </AspectRatio>
                                    <Text color="dimmed" size="xs" transform="uppercase" weight={700} mt="md">
                                        {book.volumeInfo.authors}
                                    </Text>
                                    <Text className={classes.title} mt={5}>
                                        {book.volumeInfo.title}
                                    </Text>
                                </Card>
                        </div>  
                    ))}  
                </div>  
            </div>
        </form>  
  
    )  
}  
  
export default GoogleBooksSearch  