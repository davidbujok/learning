import { useEffect, useState } from "react";
import ClothesServices from "../services/demoClothes";


function Clothes() {

  const [clothes, setClothes] = useState([]);

  useEffect(() => {
    ClothesServices.getClothes()
      .then(clothes => setClothes(clothes));
  }, []);

  return (
  <>
    {clothes.map(cloth => <p>{ cloth.name }</p>)}
  </>
  )
}

export default Clothes;
