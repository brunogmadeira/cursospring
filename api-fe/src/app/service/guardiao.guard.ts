import { Injectable } from '@angular/core';
import {
  ActivatedRouteSnapshot,
  CanActivate,
  RouterStateSnapshot,
  UrlTree,
} from '@angular/router';
import { Observable } from 'rxjs';
import { UsuarioService } from './usuario.service';

@Injectable({
  providedIn: 'root',
})
export class GuardiaoGuard implements CanActivate {
  constructor(private userService: UsuarioService) {}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ):
    | Observable<boolean | UrlTree>
    | Promise<boolean | UrlTree>
    | boolean
    | UrlTree {
    console.info('guardiao sendo chamado');
    return this.userService.userAutenticado();
  }
}
