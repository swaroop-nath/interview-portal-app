export class User {
    constructor(
        public userId: number = 0,
        public emailId: string = '',
        public dateOfBirth: Date = null,
        public roles: Role[] = []
    ) {}
}
