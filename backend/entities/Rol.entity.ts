import { Entity, Column, PrimaryGeneratedColumn } from 'typeorm';

@Entity()
export class Rol {
  @PrimaryGeneratedColumn()
  codigo!: number;
  @Column()
  descripcion!: string;
}
