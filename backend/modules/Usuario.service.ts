import { Injectable } from '@nestjs/common';
import { Usuario } from '../entities/usuario.entity';

@Injectable()
export class UsuarioService {

  private data: Usuario[] = [];

  create(createData: Usuario) {
    this.data.push(createData);
    return createData;
  }

  findAll() {
    return this.data;
  }

  findOne(id: number) {
    return this.data.find(item => (item as any).id === id);
  }

  update(id: number, updateData: Usuario) {
    const index = this.data.findIndex(item => (item as any).id === id);
    if (index !== -1) {
      this.data[index] = { ...this.data[index], ...updateData };
      return this.data[index];
    }
    return null;
  }

  remove(id: number) {
    this.data = this.data.filter(item => (item as any).id !== id);
    return { deleted: true };
  }
}
