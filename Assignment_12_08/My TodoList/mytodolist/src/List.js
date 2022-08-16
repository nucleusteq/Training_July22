function List(props) {

    return (
        <div>
            {props.itmeList.map(itemObj => {
               return <p>{itemObj.item}</p>;
            })}
        </div>
    );
}
export default List;