import { Telefone } from './telefone';

export class User {
  id!: Number;
  login!: String;
  nome!: String;
  senha!: String;
  cpf!: String;
  bairro!: String;
  localidade!: String;
  uf!: String;

  telefones!: Array<Telefone>;
}
