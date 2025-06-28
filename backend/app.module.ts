import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';

@Module({
  imports: [
    TypeOrmModule.forRoot({
      type: 'sqlite',
      database: 'db.sqlite',
      entities: [__dirname + '/entities/*.entity{.ts,.js}'],
      synchronize: true,
    }),
    require('./modules/Usuario.module').UsuarioModule,
    require('./modules/Rol.module').RolModule
  ],
  controllers: [],
  providers: [],
})
export class AppModule {}
