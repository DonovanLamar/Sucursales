import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpleadosComponent } from './components/empleados/empleados.component';
import { ListadoComponent } from './components/listado/listado.component';
import { Router } from '@angular/router';
const routes: Routes = [

  {
    path:'',
    component:Component
  },
{
    path: 'Empleados',
    component:EmpleadosComponent
},
{
   path: 'listado',
   component:ListadoComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
