import { useState } from "react";

const TeaList = ({ teas, handleDeleteTea, handleTeaUpdate }) => {
  const [tea, setTea] = useState("");
  const [edit, setEdit] = useState(false);

  const [name, setName] = useState("");
  const [brand, setBrand] = useState("");
  const [type, setType] = useState("");
  const [id, setId] = useState("");

  const handleEdit = (tea, edit) => {
    setEdit(edit);
    setId(tea.id);
    setTea(tea);
  };

  const Types = {
    TEAS: "teas",
    BISCUITS: "biscuits",
  };

  const updatedTea = {
    name: name,
    brand: brand,
    id: id,
  };

  const handleNameChange = (event) => {
    setName(event.target.value);
  };

  const handleBrandChange = (event) => {
    setBrand(event.target.value);
  };

  const handleTypeChange = (event) => {
    setType(event.target.value);
  };

  const deleteTea = (tea_id) => {
    handleDeleteTea(tea_id);
  };
  const handleFormSubmit = (e) => {
    e.preventDefault();
    handleTeaUpdate(updatedTea);
  };

  return (
    <div id="tea-list">
      <h2>All the teas!</h2>

      {edit ? (
        <form onSubmit={handleFormSubmit}>
          <label htmlFor="name">Name:</label>
          <input
            type="text"
            name="name"
            placeholder={tea.name}
            value={name}
            onChange={handleNameChange}
          />

          <label htmlFor="brand">Brand:</label>
          <input
            type="text"
            name="brand"
            placeholder={tea.brand}
            value={brand}
            onChange={handleBrandChange}
          />

          <label htmlFor="type">Type</label>
          <select name="type" value={tea.type} onChange={handleTypeChange}>
            <option value="" disabled>
              Choose...
            </option>
            <option value={Types.TEAS}>Tea</option>
            <option value={Types.BISCUITS}>Biscuit</option>
          </select>

          <input type="submit" value="Save" />
        </form>
      ) : null}
      <ul>
        {teas.map((tea) => {
          return (
            <>
              <li key={tea.name}>
                {tea.name} by {tea.brandName}
              </li>
              <button onClick={() => deleteTea(tea.id)}>delete</button>
              <button onClick={() => handleEdit(tea, true)}>update</button>
            </>
          );
        })}
      </ul>
    </div>
  );
};

export default TeaList;
