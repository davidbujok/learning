const { useState } = require("react")

import ClothesServices from "../services/demoClothes";
function Form() {
  const [clothes, setClothes] = useState();
  const [category, setCategory] = useState("");

  const categoryType = {
    dress: "DRESS",
    jeans: "JEANS",
    hats: "HATS"
  }

  const newClothes = {
    category: 
  }


  const handleSubmit = () => {

    ClothesServices.addCloths(something)
  }

  return (
    <>
    <form onSubmit={handleSubmit}>
    <input type="text" value={categoryType} onClick={(e) => }/>
    <select name="" id="">
    { for ((key, value) in categoryType){
      <option value={key}>value</option>
    }}
    </select>
    </form>
    
    </>
  )
}

