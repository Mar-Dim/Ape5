import React, { useState } from 'react';
import './formularioregistro.css';

export default function FormularioRegistroForm() {
  const [formData, setFormData] = useState({
    inputNombre: '',
    inputEmail: ''
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Form submitted:', formData);
  };

  return (
    <form className="form-formularioregistro" onSubmit={handleSubmit}>
      <h2>Formulario FormularioRegistro</h2>
      <div className="form-group">
        <label htmlFor="inputNombre">InputNombre</label>
        <input
          type="text"
          id="inputNombre"
          name="inputNombre"
          value={formData.inputNombre}
          onChange={handleChange}
          required={true}
        />
      </div>
      <div className="form-group">
        <label htmlFor="inputEmail">InputEmail</label>
        <input
          type="text"
          id="inputEmail"
          name="inputEmail"
          value={formData.inputEmail}
          onChange={handleChange}
          required={true}
        />
      </div>

      <button type="submit">Enviar</button>
    </form>
  );
}
