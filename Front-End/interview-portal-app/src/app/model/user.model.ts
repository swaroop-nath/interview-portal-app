import { Role } from './role.enum';

export class User {
    constructor(
        public emailId: string = '',
        public dateOfBirth: Date = null,
        public roles: Role[] = []
    ) {}
}
