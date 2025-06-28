import React from 'react';
import ReactDOM from 'react-dom/client';
import FormularioRegistroForm from './componentsFormularioRegistro.jsx';
import './FormularioRegistro.css';

function App() {
  return (
    <div style={{ display: 'flex', flexDirection: 'column', gap: '2rem', padding: '2rem' }}>
      <section>
        <FormularioRegistroForm />
      </section>
    </div>
  );
}

export default App;
