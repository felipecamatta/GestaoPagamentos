import { Ocorrencia } from './ocorrencia';

export class Pagamento {
    id: String
    descricao: String
    valor: DoubleRange
    dataVencimento: Date
    dataPagamento: Date
    ocorrencias: Ocorrencia[]
}
