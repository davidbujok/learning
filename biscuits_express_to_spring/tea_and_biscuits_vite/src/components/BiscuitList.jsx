const BiscuitList = ({ biscuits, handleDeleteBiscuit }) => {

  const deleteBiscuit = (biscuit_id) => {
    handleDeleteBiscuit(biscuit_id);
  }

  return (
    <div id="biscuit-list">
      <h2>All the biccys!</h2>
      <ul>
        {biscuits.map(biscuit => {
          return (
            <>
            <li key={biscuit.name}>{biscuit.name} by {biscuit.brand}</li>
            <button onClick={()=> deleteBiscuit(biscuit.id)}>delete</button>
            <button>update</button>
            </>
          )
        })}
      </ul>
    </div>
  )
}

export default BiscuitList
