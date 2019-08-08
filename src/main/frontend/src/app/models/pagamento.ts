import { Ocorrencia } from './ocorrencia';
import { Funcionario } from './funcionario';

export class Pagamento {
    id: number
    descricao: String
    valor: DoubleRange
    dataVencimento: String
    dataPagamento: String
    status: String
    ocorrencias: Ocorrencia[]
    funcionario: Funcionario
}
