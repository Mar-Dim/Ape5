import { Injectable } from '@nestjs/common';
import { Rol } from '../entities/rol.entity';

@Injectable()
export class RolService {

  private data: Rol[] = [];

  create(createData: Rol) {
    this.data.push(createData);
    return createData;
  }

  findAll() {
    return this.data;
  }

  findOne(id: number) {
    return this.data.find(item => (item as any).id === id);
  }

  update(id: number, updateData: Rol) {
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
