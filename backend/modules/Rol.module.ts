import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { Rol } from '../entities/rol.entity';
import { RolService } from './rol.service';
import { RolController } from '../controllers/rol.controller';

@Module({
  imports: [TypeOrmModule.forFeature([Rol])],
  providers: [RolService],
  controllers: [RolController],
})
export class RolModule {}
