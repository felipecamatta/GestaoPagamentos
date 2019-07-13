import { Ocorrencia } from './ocorrencia';

export class Pagamento {
    descricao: string
    valor: DoubleRange
    dataVencimento: Date
    dataPagamento: Date
    ocorrencias: Ocorrencia[]
}
