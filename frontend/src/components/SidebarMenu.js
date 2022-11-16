import "react-pro-sidebar/dist/css/styles.css";
import 'bootstrap/dist/css/bootstrap.min.css';
import { ProSidebar, Menu, MenuItem, SubMenu } from "react-pro-sidebar";
import "react-pro-sidebar/dist/css/styles.css";

function SidebarMenuComponent() { // props.product is the product we are selling
    return (
        <ProSidebar className="sidebar">
            <Menu iconShape="square">
                <MenuItem>Dashboard</MenuItem>
                <SubMenu title="Components">
                <MenuItem>Component 1</MenuItem>
                <MenuItem>Component 2</MenuItem>
                </SubMenu>
                <SubMenu title="Components"> Menu</SubMenu>
                <MenuItem >Dashboard</MenuItem>
            </Menu>
        </ProSidebar>
    )
}

export default SidebarMenuComponent;