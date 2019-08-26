import { Ocorrencia } from './ocorrencia';
import { Funcionario } from './funcionario';

export class Pagamento {
    id: number
    descricao: String
    valor: DoubleRange
    status: String
    dataVencimento: String
    dataPagamento: String    
    ocorrencias: Ocorrencia[]
    funcionario: Funcionario
}
