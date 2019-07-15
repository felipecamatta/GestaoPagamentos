import { Ocorrencia } from './ocorrencia';
import { Funcionario } from './funcionario';

export class Pagamento {
    id: String
    descricao: String
    valor: DoubleRange
    dataVencimento: Date
    dataPagamento: Date
    ocorrencias: Ocorrencia[]
    funcionario: Funcionario
}
