import Content from "../components/UI/Content.jsx";
import {Group, Select} from "@mantine/core";

const Products = () => {

    //we have to think about handling ID and fetching->passing data to a content? or just pass ID to Content...

    return (
        <>
            <div>Top div? Maybe filtering options? (like sorting order and category)</div> {/*done in backend, dont worry :)*/}
            <div>List of filtered products perhaps</div>
            <Group>
                <Select
                    data={['Books', 'Not books', 'Something else']}
                    placeholder="Filtering options"
                    label="Select what items you want to display"
                />
            </Group>
            <Content>

            </Content>
        </>
    );
}

export default Products;