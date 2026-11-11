import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // DECLARAÇÃO DE VARIÁVEIS
        Scanner sc;
        char continuar;
        boolean valorBruto, valorDesconto, valorDespFixa, valorDespVariavel, valorCapInicial, valorAplicacao, valorJuros;
        String nome, resp;
        double salarioBruto, desconto, despFixa, despVariavel;
        double rendaLiquida, despTotal, saldoMensal;
        double comprometida, poupar, aplicacao, capitalInicial;
        double acumulado12, acumulado24, acumulado60;
        double juros, taxaJuros, simularJuros12, simularJuros24, simularJuros60;
        // -------------------------------------------------------------------------------------

        sc = new Scanner(System.in);
        do {
            // CABEÇALHO DO PROGRAMA
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.println("");
            System.out.println("================================================");
            System.out.println("              SIMULADOR FINANCEIRO              ");
            System.out.println("              Usuário: " + nome + "              ");
            System.out.println("================================================");
            System.out.println("");

            // CÁLCULO DE RENDA LÍQUIDA: início
            System.out.println("Renda");

            do {
                salarioBruto = 0;
                valorBruto = false;

                while (!valorBruto) {
                    System.out.print("Digite seu salário bruto mensal: ");

                    if (sc.hasNextDouble()) {
                        salarioBruto = sc.nextDouble();

                        if (salarioBruto < 1.0) {
                            System.out.println("Erro: O salário bruto deve ser igual ou superior a R$ 1,00 para continuar.");
                        } else {
                            valorBruto = true;
                        }
                    } else {
                        System.out.println("Erro: O dado digitado está incorreto.");
                        sc.next();
                    }
                }

                desconto = 0;
                valorDesconto = false;

                while (!valorDesconto) {
                    System.out.print("Qual é o seu desconto salarial? ");

                    if (sc.hasNextDouble()) {
                        desconto = sc.nextDouble();

                        if (desconto < 0) {
                            System.out.println("Erro: O desconto salarial não pode ser negativo.");
                        } else {
                            valorDesconto = true;
                        }
                    } else {
                        System.out.println("Erro: O dado digitado está incorreto.");
                        sc.next();
                    }
                }

                if (desconto > salarioBruto) {
                    System.out.println("Alerta: Os descontos não podem ultrapassar o valor do salário bruto.");
                }

            } while (desconto >= salarioBruto);

            rendaLiquida = calcularRendaLiquida(salarioBruto, desconto);
            mensagemRendaLiquida(rendaLiquida);
            // CÁLCULO DE RENDA LÍQUIDA: fim

            // CÁLCULO DE DESPESAS: início
            System.out.println("Despesas");

            valorDespFixa = false;
            despFixa = 0;

            while (!valorDespFixa) {
                System.out.print("Quais são as suas despesas fixas do mês? ");

                if (sc.hasNextDouble()) {
                    despFixa = sc.nextDouble();
                    if (despFixa < 0) {
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
            despVariavel = 0;

            while (!valorDespVariavel) {
                System.out.print("Quais são as suas despesas variáveis no mês? ");
                if (sc.hasNextDouble()) {
                    despVariavel = sc.nextDouble();
                    if (despVariavel < 0) {
                        System.out.println("Erro: As despesas variáveis não podem ser negativas.");
                    } else {
                        valorDespVariavel = true;
                    }
                } else {
                    System.out.println("Erro: O dado digitado está incorreto.");
                    sc.next();
                }
            }

            despTotal = calculoDespesas(despFixa, despVariavel);

            System.out.println("");
            System.out.println("Despesas totais = " + despTotal);
            // CÁLCULO DE DESPESAS: fim

            // SALDO DO FINAL DO MÊS: início
            System.out.println("");

            saldoMensal = saldoDoMes(rendaLiquida, despTotal);

            System.out.printf("Saldo mensal = %.2f%n", saldoMensal);

            System.out.println("");

            situacaoFinanceira(saldoMensal);
            // SALDO DO FINAL DO MÊS: fim

            // CÁLCULO DOS INDICADORES FINANCEIROS: início
            System.out.println("");
            System.out.println("Indicadores");

            comprometida = indicadoresFinanceiros(despTotal, rendaLiquida);
            poupar = indicadoresFinanceiros(saldoMensal, rendaLiquida);

            System.out.printf("Renda comprometida (%%) = %.1f%n", comprometida);

            if (comprometida < 50) {
                System.out.println("Menos da metade de sua renda líquida está comprometida com despesas.");
            } else if (comprometida == 50) {
                System.out.println("Metade da sua renda está comprometida com despesas.");
            } else if (comprometida <= 100) {
                System.out.println("Mais da metade da renda está comprometida.");
                System.out.println("");
                System.out.println("Avalie os gastos para encontrar oportunidades de economia.");
            } else {
                System.out.println("As despesas superam a renda líquida.");
            }

            System.out.printf("Capacidade de poupança (%%) = %.1f%n", poupar);

            if (poupar == 0) {
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

            acumulado12 = calcularAcumulado(capitalInicial, aplicacao, 12);
            acumulado24 = calcularAcumulado(capitalInicial, aplicacao, 24);
            acumulado60 = calcularAcumulado(capitalInicial, aplicacao, 60);
            mensagemAcumuloPatrimonio(acumulado12, acumulado24, acumulado60);
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

            taxaJuros = calcularTaxas(juros);

            simularJuros12 = calcularJurosCompostos(acumulado12, taxaJuros, 12);
            simularJuros24 = calcularJurosCompostos(acumulado24, taxaJuros, 24);
            simularJuros60 = calcularJurosCompostos(acumulado60, taxaJuros, 60);
            mensagemAcumuloPatrimonio(simularJuros12, simularJuros24, simularJuros60);
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

    // ÁREA DE MÉTODOS

    public static double calcularRendaLiquida(double salarioBruto, double desconto) {
        return salarioBruto - desconto;
    }

    public static void mensagemRendaLiquida(double rendaLiquida) {
        System.out.println("");
        System.out.printf("Renda líquida = R$ %.2f%n", rendaLiquida);
        System.out.println("");
    }

    public static double calculoDespesas(double n1, double n2) {
        return n1 + n2;
    }

    public static void situacaoFinanceira(double saldoMensal) {
        if (saldoMensal > 0) {
            System.out.println("=== Mês concluído com saldo positivo ===");
            if (saldoMensal >= 50) {
                System.out.println("Considere começar a guardar parte do dinheiro que sobrou.");
            } else {
                System.out.println("Sua sobra mensal é pequena. Avalie se é possível aumentar sua reserva financeira.");
            }
        } else if (saldoMensal == 0) {
            System.out.println("=== Todo o seu saldo do mês foi comprometido ===");
            System.out.println("");
            System.out.println("Corte custos desnecessários ou busque uma fonte de renda extra para conseguir guardar mais dinheiro no final do mês.");
        } else {
            System.out.println("=== As despesas ultrapassaram a renda líquida ===");
        }
    }

    public static double saldoDoMes(double n1, double n2) {
        return n1 - n2;
    }

    public static double indicadoresFinanceiros(double n1, double n2) {
        return (n1 / n2) * 100;
    }

    public static double calcularTaxas(double n1) {
        return (n1 / 100) + 1;
    }

    public static double calcularAcumulado(double capitalInicial, double aplicacao, int meses) {
        return capitalInicial + (aplicacao * meses);
    }

    public static double calcularJurosCompostos(double acumulado, double taxaJuros, int meses) {
        return acumulado * (Math.pow(taxaJuros, meses));
    }

    public static void mensagemAcumuloPatrimonio(double meses12, double meses24, double meses60) {
        System.out.printf("Valor acumulado após 12 meses = %.2f%n", meses12);
        System.out.printf("Valor acumulado após 24 meses = %.2f%n", meses24);
        System.out.printf("Valor acumulado após 60 meses = %.2f%n", meses60);
    }

}
