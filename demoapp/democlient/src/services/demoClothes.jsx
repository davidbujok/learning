const baseURL = 'http://localhost:8080/clothes/';

const ClothesServices =  {
  getClothes() {
    return fetch(baseURL)
      .then(res => res.json());
  },


  addCloths(clothes) {
    return fetch(baseURL, {
      method: 'POST',
      body: JSON.stringify(clothes),
      headers: {
        'Content-Type': 'application/json'
      }
    })
      .then(res => res.json());
  },

  updateClothes(clothes) {
    return fetch(baseURL + booking._id, {
      method: 'PUT',
      body: JSON.stringify(clothes),
      headers: {
        'Content-Type': 'application/json'
      }
    })
      .then(res => res.json());
  },

  deleteClothes(id) {
    return fetch(baseURL + id, {
      method: 'DELETE'
    });
  }
};

export default ClothesServices;

