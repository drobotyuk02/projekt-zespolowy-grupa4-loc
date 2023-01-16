import {
    Badge,
    Image,
    Button,
    Card,
    Center,
    Container,
    Group,
    Paper,
    SimpleGrid,
    Text,
    createStyles, Box, Anchor, Rating
} from "@mantine/core";

import {IconBookmark} from '@tabler/icons';

const Product = () => {

    return (
        <Card shadow="sm" p="lg" radius="md" withBorder>
            <Card.Section component="a" href="https://mantine.dev/">
                <Image
                    src="https://images.unsplash.com/photo-1527004013197-933c4bb611b3?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=720&q=80"
                    height={160}
                    alt="Norway"
                />
            </Card.Section>

            <Group position="apart" mt="md" mb="xs">
                <Text weight={500}>Example book</Text>
                {/*<Text weight={500}>{productsArray.title}</Text>*/}
                <Rating readOnly value={4.33} fractions={8}/>
                <Badge color="pink" variant="light">
                    On Sale
                </Badge>
                <Badge color="yellow.6" variant="light">
                    Borrow now
                </Badge>
            </Group>

            <Text size="sm" color="dimmed">
                Description coming Soon!
            </Text>
            {/*maybe price somewhere here???*/}
            <Center mt="md">
                <Button variant="filled" color="blue.6" fullWidth radius="md">
                    Add to cart
                </Button>
                <Center ml={20}>
                    <Anchor component='button' sx={{textDecoration: 'none', lineHeight: 1}}>
                        <IconBookmark style={{strokeWidth: 2.25, height: 26, width: 26}}/>
                    </Anchor>
                </Center>
            </Center>
            {/*<SimpleGrid cols={2} >*/}
            {/*    */}
            {/*</SimpleGrid>*/}
        </Card>
    );
}

export default Product;