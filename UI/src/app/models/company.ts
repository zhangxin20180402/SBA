export class Company{
    constructor(
        public id: number,
        public name?:string,
        public turnover?: string,
        public ceo?: string, 
        public boardOfDirectors?: string,
        public sector?: string, 
        public briefwriteup?: string,
    ){}
}