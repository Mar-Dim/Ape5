import { Controller, Get, Post, Body } from '@nestjs/common';
import { RolService } from '../modules/rol.service';
import { Rol } from '../entities/rol.entity';

@Controller('rol')
export class RolController {
  constructor(private readonly service: RolService) {}

  @Post()
  create(@Body() data: Rol) {
    return this.service.create(data);
  }

  @Get()
  findAll() {
    return this.service.findAll();
  }
}
