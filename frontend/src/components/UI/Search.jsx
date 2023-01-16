import '../../assets/styles/searchBar.scss'

const handleChange = (event) => {
    console.log("I've changed")
}

const Search = (props) => {
    return (
        <form onSubmit={console.log("submitted!")} >
            {/*<div className="containerSearch" style={{ marginBottom: "45px" }}>*/}
            <div className="containerSearch">
                <input
                    // style={{marginTop: "25px"}}
                    onChange={handleChange}
                    className="AutoFocus"
                    type="text"
                />
                <div className="search"></div>
            </div>
        </form>
    );
}

export default Search;