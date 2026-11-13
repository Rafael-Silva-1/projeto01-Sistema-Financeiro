
import java.util.Scanner;
import entities.Usuario;
import entities.Financas;
import entities.Simulacao;

public class Main {

    public static void main(String[] args) {

        // DECLARAÇÃO DE VARIÁVEIS
        char continuar;
        boolean valorBruto, valorDesconto, valorDespFixa, valorDespVariavel;
        boolean valorCapInicial, valorAplicacao, valorJuros;
        String resp;
        double aplicacao, capitalInicial;
        double acumulado12, acumulado24, acumulado60;
        double juros, taxaJuros, simularJuros12, simularJuros24, simularJuros60;
        // -------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();
        Financas financas = new Financas();
        Simulacao simulacao = new Simulacao();

        do {
            // CABEÇALHO DO PROGRAMA
            System.out.print("Digite seu nome: ");
            usuario.setNome(sc.nextLine());

            System.out.println("");
            System.out.println("================================================");
            System.out.println("              SIMULADOR FINANCEIRO              ");
            System.out.println("              Usuário: " + usuario.getNome() + "              ");
            System.out.println("================================================");
            System.out.println("");

            // CÁLCULO DE RENDA LÍQUIDA: início
            System.out.println("Renda");

            do {
                usuario.setSalarioBruto(0);
                valorBruto = false;

                while (!valorBruto) {
                    System.out.print("Digite seu salário bruto mensal: ");

                    if (sc.hasNextDouble()) {
                        usuario.setSalarioBruto(sc.nextDouble());

                        if (usuario.getSalarioBruto() < 1.0) {
                            System.out.println("Erro: O salário bruto deve ser igual ou superior a R$ 1,00 para continuar.");
                        } else {
                            valorBruto = true;
                        }
                    } else {
                        System.out.println("Erro: O dado digitado está incorreto.");
                        sc.next();
                    }
                }

                usuario.setDesconto(0);
                valorDesconto = false;

                while (!valorDesconto) {
                    System.out.print("Qual é o seu desconto salarial? ");

                    if (sc.hasNextDouble()) {
                        usuario.setDesconto(sc.nextDouble());

                        if (usuario.getDesconto() < 0) {
                            System.out.println("Erro: O desconto salarial não pode ser negativo.");
                        } else {
                            valorDesconto = true;
                        }
                    } else {
                        System.out.println("Erro: O dado digitado está incorreto.");
                        sc.next();
                    }
                }

                if (usuario.getDesconto() > usuario.getSalarioBruto()) {
                    System.out.println("Alerta: Os descontos não podem ultrapassar o valor do salário bruto.");
                }

            } while (usuario.getDesconto() >= usuario.getSalarioBruto());

            financas.setRendaLiquida(usuario.calcularRendaLiquida(
                usuario.getSalarioBruto(),
                usuario.getDesconto()
            ));

            usuario.mensagemRendaLiquida(financas.getRendaLiquida());
            // CÁLCULO DE RENDA LÍQUIDA: fim

            // CÁLCULO DE DESPESAS: início
            System.out.println("Despesas");

            valorDespFixa = false;
            financas.setDespFixa(0);

            while (!valorDespFixa) {
                System.out.print("Quais são as suas despesas fixas do mês? ");

                if (sc.hasNextDouble()) {
                    financas.setDespFixa(sc.nextDouble());

                    if (financas.getDespFixa() < 0) {
                        System.out.println("Erro: As despesas fixas não podem ser negativas.");
                    } else {
                        valorDespFixa = true;
                    }
                } else {
                    System.out.println("Erro: O dado digitado está incorreto.");
                    sc.next();
                }
            }

            valorDespVariavel = false;
            financas.setDespVariavel(0);

            while (!valorDespVariavel) {
                System.out.print("Quais são as suas despesas variáveis no mês? ");

                if (sc.hasNextDouble()) {
                    financas.setDespVariavel(sc.nextDouble());

                    if (financas.getDespVariavel() < 0) {
                        System.out.println("Erro: As despesas variáveis não podem ser negativas.");
                    } else {
                        valorDespVariavel = true;
                    }
                } else {
                    System.out.println("Erro: O dado digitado está incorreto.");
                    sc.next();
                }
            }

            financas.setDespTotal(financas.calculoDespesas(
                financas.getDespFixa(),
                financas.getDespVariavel()
            ));

            System.out.println("");
            System.out.println("Despesas totais = " + financas.getDespTotal());
            // CÁLCULO DE DESPESAS: fim

            // SALDO DO FINAL DO MÊS: início
            System.out.println("");

            financas.setSaldoMensal(financas.saldoDoMes(
                financas.getRendaLiquida(),
                financas.getDespTotal()
            ));

            System.out.printf("Saldo mensal = %.2f%n", financas.getSaldoMensal());

            System.out.println("");

            financas.situacaoFinanceira(financas.getSaldoMensal());
            // SALDO DO FINAL DO MÊS: fim

            // CÁLCULO DOS INDICADORES FINANCEIROS: início
            System.out.println("");
            System.out.println("Indicadores");

            financas.setComprometida(financas.indicadoresFinanceiros(
                financas.getDespTotal(),
                financas.getRendaLiquida()
            ));

            financas.setPoupar(financas.indicadoresFinanceiros(
                financas.getSaldoMensal(),
                financas.getRendaLiquida()
            ));

            System.out.printf("Renda comprometida (%%) = %.1f%n", financas.getComprometida());

            if (financas.getComprometida() < 50) {
                System.out.println("Menos da metade de sua renda líquida está comprometida com despesas.");
            } else if (financas.getComprometida() == 50) {
                System.out.println("Metade da sua renda está comprometida com despesas.");
            } else if (financas.getComprometida() <= 100) {
                System.out.println("Mais da metade da renda está comprometida.");
                System.out.println("");
                System.out.println("Avalie os gastos para encontrar oportunidades de economia.");
            } else {
                System.out.println("As despesas superam a renda líquida.");
            }

            System.out.printf("Capacidade de poupança (%%) = %.1f%n", financas.getPoupar());

            if (financas.getPoupar() == 0) {
                System.out.println("");
                System.out.println("Procure pequenas despesas que possam ser reduzidas.");
            }
            // CÁLCULO DOS INDICADORES FINANCEIROS: fim

            // CÁLCULO DE ACÚMULO DE PATRIMÔNIO: início
            System.out.println("");
            System.out.println("Projeção de patrimônio - SEM JUROS COMPOSTOS");

            valorCapInicial = false;
            capitalInicial = 0;

            while (!valorCapInicial) {
                System.out.print("Possui algum valor guardado? Quanto? ");

                if (sc.hasNextDouble()) {
                    capitalInicial = sc.nextDouble();

                    if (capitalInicial < 0) {
                        System.out.println("Alerta: O valor guardado não pode ser menor que 0.");
                    } else {
                        valorCapInicial = true;
                    }
                } else {
                    System.out.println("Erro: O dado digitado está incorreto.");
                    sc.next();
                }
            }

            aplicacao = 0;
            valorAplicacao = false;

            while (!valorAplicacao) {
                System.out.print("Quanto deseja aplicar mensalmente? (mínimo de R$ 10,00) ");

                if (sc.hasNextDouble()) {
                    aplicacao = sc.nextDouble();

                    if (aplicacao < 10) {
                        System.out.println("Alerta: O valor dos aportes mensais precisa ser de pelo menos R$ 10,00.");
                    } else {
                        valorAplicacao = true;
                    }
                } else {
                    System.out.println("Erro: O dado digitado está incorreto.");
                    sc.next();
                }
            }

            acumulado12 = simulacao.calcularAcumulado(capitalInicial, aplicacao, 12);
            acumulado24 = simulacao.calcularAcumulado(capitalInicial, aplicacao, 24);
            acumulado60 = simulacao.calcularAcumulado(capitalInicial, aplicacao, 60);

            simulacao.mensagemAcumuloPatrimonio(acumulado12, acumulado24, acumulado60);
            // CÁLCULO DE ACÚMULO DE PATRIMÔNIO: fim

            // CÁLCULO DE PATRIMÔNIO COM JUROS: início
            System.out.println("");
            System.out.println("Simulação de juros compostos - SEM NOVAS APLICAÇÕES");

            juros = 0;
            valorJuros = false;

            while (!valorJuros) {
                System.out.print("Digite a taxa de juros a ser calculada (ex.: 0,1): ");

                if (sc.hasNextDouble()) {
                    juros = sc.nextDouble();

                    if (juros <= 0) {
                        System.out.println("Alerta: A taxa de juros deve ser superior a 0.");
                    } else {
                        valorJuros = true;
                    }
                } else {
                    System.out.println("Erro: O dado digitado está incorreto.");
                    sc.next();
                }
            }

            taxaJuros = simulacao.calcularTaxas(juros);

            simularJuros12 = simulacao.calcularJurosCompostos(acumulado12, taxaJuros, 12);
            simularJuros24 = simulacao.calcularJurosCompostos(acumulado24, taxaJuros, 24);
            simularJuros60 = simulacao.calcularJurosCompostos(acumulado60, taxaJuros, 60);

            simulacao.mensagemAcumuloPatrimonio(simularJuros12, simularJuros24, simularJuros60);
            // CÁLCULO DE PATRIMÔNIO COM JUROS: fim

            System.out.println("");
            System.out.println("Deseja fazer outra simulação? S/N ");
            sc.nextLine();

            resp = sc.nextLine().trim().toUpperCase();

            while (resp.isEmpty() || (resp.charAt(0) != 'S' && resp.charAt(0) != 'N')) {
                System.out.println("");
                System.out.println("Deseja fazer outra simulação? S/N ");
                resp = sc.nextLine().trim().toUpperCase();
            }

            continuar = resp.charAt(0);

        } while (continuar == 'S');

        // SINALIZAÇÃO DE ENCERRAMENTO
        System.out.println("");
        System.out.println("                 FIM DO PROGRAMA                ");
        System.out.println("================================================");

        sc.close();
    }
}