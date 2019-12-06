export class StockExchange{
    constructor(
        public id: number,
        public name?:string,
        public brief?: string,
        public contactAddress?: string, 
        public remark?: string
    ){}
}