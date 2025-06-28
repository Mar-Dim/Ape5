import { Controller, Get, Post, Body } from '@nestjs/common';
import { UsuarioService } from '../modules/usuario.service';
import { Usuario } from '../entities/usuario.entity';

@Controller('usuario')
export class UsuarioController {
  constructor(private readonly service: UsuarioService) {}

  @Post()
  create(@Body() data: Usuario) {
    return this.service.create(data);
  }

  @Get()
  findAll() {
    return this.service.findAll();
  }
}
