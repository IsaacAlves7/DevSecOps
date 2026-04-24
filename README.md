# 🔒 DevSecOps
<img src="https://em-content.zobj.net/source/microsoft-teams/363/locked_1f512.png" height="77" align="right">

O **DevSecOps** é uma abordagem moderna e culturalmente orientada para o desenvolvimento de software que coloca a segurança cibernética no centro de todo o ciclo de vida de desenvolvimento de aplicativos. O termo é uma combinação de "Development" (desenvolvimento), "Security" (segurança) e "Operations" (operações), destacando a integração da segurança desde o início do processo de desenvolvimento até a operação e manutenção contínuas. 

Na prática, o DevSecOps automatiza a integração da segurança em todas as fases do ciclo de vida de desenvolvimento de software, desde o design inicial até a integração, teste, implementação e entrega do software. O DevSecOps representa uma evolução natural e necessária na forma como as organizações de desenvolvimento abordam a segurança. 

No passado, a segurança era "acrescentada" ao software no final do ciclo de desenvolvimento (quase como algo menos importante) por uma equipe de segurança distinta e testada por uma equipe de garantia de qualidade (QA) separada. Isso era gerenciável quando atualizações de software eram liberadas apenas uma ou duas vezes por ano. Mas, à medida que os desenvolvedores de software adotam as práticas Agile e DevOps com o objetivo de reduzir os ciclos de desenvolvimento de software para semanas ou até mesmo dias, a abordagem tradicional de segurança criou um gargalo inaceitável. 

A segurança deve ser a prioridade de um sistema e é algo que deve ser feito da maneira correta, então se você está aqui é porque tem esse cuidado. Estar preocupado com as informações pessoais dos seus usuários, já é um sinal de que está fazendo a coisa certa. A GDPR acabou de chegar e este conteúdo é ainda mais relevante. Ainda que você tome uma boa decisão é importante saber que há um consenso geral sobre segurança: Não há sistemas totalmente seguro. 

Há muitas soluções que oferecem implementações de **autenticação** e **autorização**, então nada de reinventar a roda. A menos que você tenha certeza do que está fazendo e seja em especialista em segurança, não tente criar uma implementação própria, há um ditado que diz: Criptografia feita por amadores, são criptografias amadoras. Com um pequeno ajuste, essa frase se encaixa neste cenário: Uma autenticação feita por amadores, é uma autenticação amadora.

> **Autenticação** (Authentication) se trata do processo de identificação e validação de quem você é dentro de uma aplicação/sistema e o processo de autenticação geralmente feito antes da autorização. Quando você tenta inserir suas credenciais e (login) e o sistema identificá-lo este processo é chamado de autenticação `username` e `password`. Já, **Autorização** (Authorization) é o processo de o que você, usuário ou administrador autenticado, no sistema pode fazer e suas permissões para acessar os recursos. A autorização determina o que os usuários podem e não podem acessar e geralmente é feita após a autenticação bem-sucedida.

Existem técnicas de invasão da qual você não se preparou e que podem pôr seu sistema a prova, logo, está vulnerável. Utilize algum framework. De maneira geral, elas já estão maduras o suficiente. Tem uma comunidade ou empresa por trás de seu desenvolvimento.

Principais características e conceitos do DevSecOps:

<img src="https://user-images.githubusercontent.com/61624336/201489337-fc20acf3-24ae-4f92-b550-1daa1fcb0360.png" height="77" align="right">

A **Integração de Segurança** no DevSecOps, a segurança é incorporada em todas as etapas do desenvolvimento, desde o planejamento até a implantação e operações. Isso envolve a identificação de **vulnerabilidades**, análise de riscos e implementação de controles de segurança desde o início.

As **vulnerabilidades** são pontos fracos de um sistema ou software que o expõe ao risco de invasão. Já uma **falha** é um termo geralmente usado para descrever a ocorrência de um problema, defeito, erro ou mau funcionamento em um sistema, produto, processo ou em qualquer coisa que não esteja funcionando conforme o esperado ou planejado. As falhas podem ocorrer em uma ampla variedade de contextos, incluindo tecnologia, engenharia, sistemas de informação, máquinas, produtos, processos industriais e até mesmo em situações do dia a dia. Um **incidente** é um evento não planejado, não desejado ou inesperado que pode interromper, prejudicar ou afetar as operações normais de uma organização, sistema, rede, processo ou atividade. Incidentes podem ocorrer em uma ampla variedade de contextos, incluindo segurança cibernética, segurança física, operações de negócios, saúde e segurança, meio ambiente e muito mais. Esse risco de invasão nós chamamos de **ameaça** que é, no contexto de segurança da informação, é qualquer coisa que pode explorar uma vulnerabilidade de forma intencional ou acidental para obter dados de forma indevida ou prejudicar o funcionamento correto de um sistema, podendo ser corrupção de dados, perdas de informações, roubos de informações e violação de dados.

O DevSecOps promove a **colaboração** estreita entre equipes de desenvolvimento, segurança e operações (Dev, Sec e Ops). Isso quebra barreiras tradicionais e ajuda a garantir que as preocupações de segurança sejam abordadas em todo o processo de desenvolvimento.

A **automação** (automatização) desempenha um papel crucial no DevSecOps. Ela permite a execução de verificações de segurança, análise de código, testes de vulnerabilidade e muito mais como parte de pipelines de entrega contínua. Isso ajuda a identificar e corrigir problemas de segurança de maneira rápida e consistente.

São realizados **testes de segurança contínuos** para identificar e mitigar vulnerabilidades em um estágio inicial do desenvolvimento. Isso inclui testes de penetração, análise estática e dinâmica de código, verificação de conformidade, entre outros.

O DevSecOps promove uma **cultura de segurança** em toda a organização, incentivando todos os membros da equipe a assumir a responsabilidade pela segurança cibernética.

A integração de ferramentas de monitoramento e detecção de ameaças permite uma resposta rápida a incidentes de segurança, minimizando o impacto de possíveis violações.

O DevSecOps fornece **visibilidade** completa das atividades de desenvolvimento, permitindo o **rastreamento** de quem fez o quê e quando. Isso é fundamental para a conformidade e investigação de incidentes.

A integração de controles de segurança e políticas de **conformidade** ajuda as organizações a atender a regulamentações e padrões de segurança.

DevSecOps visa criar uma abordagem contínua e holística para a segurança, incorporando-a à cultura e aos processos de desenvolvimento de software. Isso ajuda a reduzir o risco de vulnerabilidades, violações de segurança e a melhorar a qualidade do software entregue. É uma resposta aos desafios da segurança cibernética em um ambiente de desenvolvimento ágil e entrega contínua.

O DevSecOps integra a segurança de aplicativo e infraestrutura perfeitamente em processos e ferramentas Agile e DevOps. Ele aborda os problemas de segurança à medida que surgem, quando são mais fáceis, rápidos e baratos de corrigir (e antes de serem colocados em produção). Além disso, o DevSecOps torna a segurança de aplicativos e infraestrutura uma responsabilidade compartilhada das equipes de desenvolvimento, segurança e operações de TI, em vez de ser responsabilidade exclusiva de um silo de segurança. Ele oferece condições para seguir o lema DevSecOps, "software mais seguro e mais rápido", automatizando a entrega de software seguro sem desacelerar o ciclo de desenvolvimento de software.

Com a pandemia, a frequência com que vemos nas notícias incidentes relacionados a segurança em diferentes tipos de empresas e organizações aumentou muito. Ataques como ransomwares (sequestro de dados por dinheiro), phishing (roubo de informações online como, por exemplo, fraude via e-mail ou SMS) e derrubadas de sistemas têm se tornado cada vez mais um motivo de preocupação. Com esses relatos, a busca de formas de prevenção de ataques também se tornaram mais comuns, por isso o uso da **cibersegurança**. A busca por profissionais de TI especializados em segurança também aumentou dentro das empresas.

> A **cibersegurança**, também chamada de segurança de computadores ou segurança da tecnologia da informação, abrange técnicas e ações que tem como objetivo proteger sistemas, programas, equipamentos, redes e pessoas de ataques cibernéticos, crimes virtuais e terrorismo cibernético. É comum que as práticas de cibersegurança estejam divididas em três grupos (embora existam outros): o **blue team**, **red team** e também em **desenvolvimento seguro**. O *Blue team* e *red team* são times focados em achar brechas de segurança ou vulnerabilidades e que sugerem formas de proteger os sistemas, redes e dados. Já _desenvolvimento seguro_, de forma resumida, é aplicação de práticas de segurança no desenvolvimento de software.

Agora que já temos uma visão geral sobre as ações e as técnicas aplicadas à cibersegurança, vamos adentrar um pouco mais nos times que mencionamos?

É cada vez mais frequente o número de ataques e ameaças e, devido a isso, manter aplicações seguras na Web é uma tarefa que está ficando cada vez mais difícil. Então, para solucionar esses problemas foram criadas equipes de profissionais especializados em combater ameaças cibernéticas e vulnerabilidades de sistemas.

Atualmente, no mercado, temos o **Red team** (equipe vermelha), que tem como foco os **ataques**, ou seja, é uma equipe que trabalha na área de Segurança Ofensiva com o objetivo de validação de segurança das aplicações, infraestrutura, serviços e sistemas através de testes de invasão, ou Pentest (Penetration Test). 

E, temos também, o **Blue team** (equipe azul) que tem como foco a **defesa**, ou seja, simulam a defesa dos ataques de forma proativa e é responsável por atuar na defesa contra uma invasão. Então, caso uma aplicação sofra uma tentativa de invasão, o time azul entra em ação com o foco de impedir que essa ação tenha sucesso.

> **Resumindo**: o red team encontra as falhas e simula o ataque, enquanto que o blue team trabalha buscando uma solução para os erros. As pessoas que compõem o red team também exercem o papel de **hacker ético**. Eventualmente, as duas equipes podem trabalhar juntas, blue e red team, contra as vulnerabilidades existentes nos amplos setores de uma empresa de TI.

Esses profissionais exercem o papel de hacker ético que é um profissional de TI empresarial que lida com a segurança da informação de uma empresa. Seu objetivo é descubrir as vulnerabilidades dos sistemas no ponto de vista de um invasor. Com isso, ele pode implementar uma rede segura que evita as violações de segurança. E, assim, ajudando a proteger as redes com avaliação do mundo real.

> Um **hacker** ou **craker** é uma pessoa com excelente conhecimento tecnológico, capaz de fazer hacks e cheats em um sistema. Essa palavra surgiu na década de 60, em 1960, pelo Instituto Tecnológico de MIT e em 1983 a mídia utilizou esse termo hacker de modo perjorativo para se referir aos criminosos do mundo cibernético e em 1984 foi introduzido a matéria que nem todos os hackers teriam intuitos maliciosos.

Portanto, se formos considerar um hacker fora do sistema corporativo temos um meio de reconhecer e categorizar o nível de intenção de um hacker por meio de suas atividades, veja abaixo:

<img src="https://user-images.githubusercontent.com/61624336/201488908-5f8f4ce2-6229-4232-a916-a71c8849066d.jpg" align="right" height="177">

- **White Hat** (Chapéu Branco): Também chamados de hackers éticos, são profissionais éticos que geralmente são contratados como analista de sistemas e especialistas em TI, ou seja, eles possuem permissão para realizar essas ações no sistema da empresa, evitando assim ataques de Black Hats ou a entrada de Gray Hats;

- **Black Hat** (Chapéu Preto): Burlam sistemas e são especialistas em invasões de sites, entretanto, com intenções questionáveis. Não possuem permissão para entrar no sistema, estes são os hackers maliciosos que fazem sequestros e divulgação indevida de arquivos secretos, ou realizam ataques nos computadores de qualquer tipo de usuário para fins próprios ou lucrativos. Sendo assim, se destacam por não serem éticos ou terem escrúpulos;

- **Gray Hat** (Chapéu Cinza): Burlam sistemas e são especialistas em invasões de sites, entretanto, com intenções questionáveis. Não possuem permissão para entrar em um sistema, mas conseguem entrar através de falhas e vulnerabilidades e se aproveitam disso para fins próprios. Se destacam por serem o meio termo entre o White e Black Hat, sendo eles, geralmente, hackers terceiros que buscam encontrar vulnerabilidades em empresas e reporta-los a fim de obter um cargo nessa empresa.

Além dessas equipes, temos também o **Purple Team** (equipe roxa) que é focado tanto na **defensiva** como na **ofensiva**, isso é feito em algumas empresas de TI como consultorias. E também temos o **Cyber Risk Team** que não se enquadra estritamente nas categorias tradicionais de "Red Team" ou "Blue Team". Em vez disso, essa equipe desempenha um papel diferente e geralmente se concentra na gestão de riscos cibernéticos e na avaliação das vulnerabilidades em uma organização. Eles não são diretamente equivalentes ao Red Team ou ao Blue Team, que têm funções distintas em testes de segurança cibernética, mas sim tem uma função mais ampla, que envolve a avaliação de riscos cibernéticos, o desenvolvimento de estratégias de mitigação de riscos e a gestão geral da postura de segurança cibernética da organização. Eles não estão necessariamente envolvidos em simulações de ataques como o Red Team nem desempenham a função de defensores em tempo real como o Blue Team. Suas atividades são voltadas para a gestão e análise de riscos cibernéticos, ajudando a organização a tomar decisões informadas sobre segurança.

> **Curiosidade**: Além das áreas de atuação citadas, profissionais de segurança defensiva também podem atuar em programas de **Bug Bounty** que, por sua vez, são uma iniciativa que recompensa as pessoas por relatarem problemas, ou bugs, em sistemas no nível de segurança da informação. Os profissionais de segurança que participam desses programas são denominados _bugs bounters_. Alguns exemplos de recompensas e casos podem ser encontrados na plataforma <a href="https://hackerone.com/hacktivity">Hackerone</a> e também por meio dos relatórios da <a href="https://www.bugcrowd.com/">Bugcrowd</a>.

Os fatores que afetam a segurança da informação atualmente são:

1. Falhas na segurança física e lógica
2. Vulnerabilidades de programas
3. Infraestrutura mal-configurada
4. Falta de conscientização e capacitação dos indivíduos
5. Ausência de controles de acesso
6. Inexistência de planos de gerenciamento de segurança
7. Falta de planos de continuidade e conformidade
8. Política falha de backup de informações relevantes

Portanto, essas equipes lidam com a **segurança da informação** que trata das ferramentas e os processos aplicados para proteger as informações e é com a utilização dessas ferramentas e processos que podemos implementar soluções que impeçam que pessoas não autorizadas acessem informações importantes, ainda é importante ficarmos atentos aos princípios básicos dela que são: confidencialidade, integridade e disponibilidade.

A **confidencialidade** trata do acesso a informação apenas para pessoas devidamente autorizadas. A **integridade** trata da veracidade da informação que não deve ser corrompida. E a **disponibilidade** que trata do acesso da informação para pessoas autorizadas sempre que forem ter necessidade.

Como projetamos um sistema seguro?
Projetar sistemas seguros é importante por diversos motivos, que vão desde proteger informações sensíveis até garantir a estabilidade e confiabilidade da infraestrutura. Como desenvolvedores, devemos projetar e implementar essas diretrizes de segurança por padrão.

O diagrama abaixo é uma folha de dica pragmática com os casos de uso e pontos-chave de design.

<img width="550" height="550" alt="unnamed" src="https://github.com/user-attachments/assets/bf89386e-ed5b-44e7-9816-20a81a0a93ee" />

Autenticação

Autorização

Criptografia

Vulnerabilidade

Auditoria e Conformidade

Segurança de Rede

Segurança do Terminal

Respostas de Emergência

Segurança de Contêineres

Segurança da API

Gestão de Fornecedores de Terceiros

Recuperação de Desastres

<img width="1100" height="1100" alt="re" src="https://github.com/user-attachments/assets/f105fd77-236d-4ae1-9d8e-4898ae8e7b41" />

Codificação
A codificação converte dados para um formato diferente usando um esquema que pode ser facilmente invertido. Exemplos incluem a codificação Base64, que codifica dados binários em caracteres ASCII, facilitando a transmissão de dados por mídias projetadas para lidar com dados textuais.

Codificação não é feita para proteger dados. Os dados codificados podem ser facilmente decodificados usando o mesmo esquema sem a necessidade de uma chave.

Criptografia
A criptografia envolve algoritmos complexos que utilizam chaves para transformar dados. A criptografia pode ser simétrica (usando a mesma chave para criptografia e descriptografia) ou assimétrica (usando uma chave pública para criptografia e uma chave privada para descriptografia).

A criptografia é projetada para proteger a confidencialidade dos dados ao transformar dados legíveis (texto simples) em um formato ilegível (texto cifrado) usando um algoritmo e uma chave secreta. Somente aqueles com a chave correta podem descriptografar e acessar os dados originais.

Tokenização
Tokenização é o processo de substituir dados sensíveis por marcadores não sensíveis chamados tokens. O mapeamento entre os dados originais e o token é armazenado de forma segura em um cofre de tokens. Esses tokens podem ser usados em vários sistemas e processos sem expor os dados originais, reduzindo o risco de vazamentos de dados.

A tokenização é frequentemente usada para proteger informações de cartão de crédito, números de identificação pessoal e outros dados sensíveis. A tokenização é altamente segura, pois os tokens não contêm nenhuma parte dos dados originais e, portanto, não podem ser reproduzidos para revelar os dados originais. É particularmente útil para conformidade com regulamentos como PCI DSS.

## [DevSecOps] TPM 2.0
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/10a5c8e9-1222-433a-bad4-7699bb17ecf8" align="right" height="177">

O **TPM 2.0** é a sigla para "Trusted Platform Module 2.0" em inglês. Trata-se de um padrão internacional para um chip de segurança de hardware que é projetado para fornecer funcionalidades de segurança em computadores e outros dispositivos eletrônicos. O TPM é uma parte essencial da infraestrutura de segurança em muitos sistemas, especialmente em ambientes empresariais e em dispositivos que precisam de proteção contra ameaças de segurança.

Um Trusted Platform Module, também conhecido como TPM, é um coprocessador criptográfico que está presente na maioria dos PCs e servidores comerciais. Em termos de estar presente em computadores, os TPMs são quase onipresentes, mas até recentemente eles eram principalmente invisíveis para os usuários devido à falta de aplicativos atraentes que os usam. Essa situação está mudando rapidamente. Com a recente concessão da certificação Federal Information Processing Standards (FIPS) a vários projetos de TPM e as recomendações do Conselho de Conselheiros do Presidente para que o governo dos Estados Unidos comece a usar TPMs para defender os computadores do país, o TPM se tornou um ativo estratégico para os proprietários de computadores defenderem seus ativos criptográficos. Ainda é verdade que pouquíssimas pessoas conhecem o suficiente sobre TPMs para utilizá-los de forma vantajosa.

O TPM 2.0 (Trusted Platform Module 2.0) é um componente de hardware que pode ser incorporado em várias categorias de dispositivos eletrônicos, especialmente em computadores pessoais e servidores. Geralmente, você encontrará TPM 2.0 em:

- Placas-mãe de computadores: Muitas placas-mãe de computadores desktop e laptops modernos vêm com um conector ou chip TPM 2.0 integrado. Isso permite que o sistema seja configurado para aproveitar as funcionalidades de segurança oferecidas pelo TPM.

- Dispositivos móveis: Alguns dispositivos móveis, como tablets e laptops, também podem incluir um chip TPM 2.0 para melhorar a segurança do dispositivo e dos dados armazenados nele.

- Servidores: Muitos servidores empresariais e data centers são equipados com TPMs para reforçar a segurança dos sistemas e dados em ambientes de servidor.

- Módulos TPM independentes: Em alguns casos, você pode adquirir módulos TPM separados que podem ser conectados a um slot de expansão em uma placa-mãe ou diretamente à porta TPM se disponível.

É importante observar que a presença e a capacidade de um TPM 2.0 em um dispositivo específico podem variar de acordo com o fabricante e o modelo. Além disso, o TPM precisa ser ativado e configurado adequadamente no BIOS ou UEFI do sistema para que suas funcionalidades de segurança sejam utilizadas.

O TPM é frequentemente usado para armazenar chaves de criptografia, medir a integridade do sistema e fornecer funções de segurança adicionais. Essas características são especialmente valiosas em ambientes empresariais e em dispositivos que lidam com informações sensíveis. Portanto, ao adquirir um dispositivo para fins de segurança, é aconselhável verificar se ele possui um TPM 2.0 ou a versão mais recente e se ele está ativado para aproveitar os benefícios de segurança adicionais que ele oferece.

## [DevSecOps] Normas de Segurança da Informação e Gestão de Continuidade do Negócio
As **normas ISO**, ou International Organization for Standardization (Organização Internacional de Normalização, em português), são um conjunto de padrões internacionais que foram desenvolvidos para garantir a qualidade, segurança e eficiência de produtos, serviços e sistemas em diversas áreas. A ISO é uma organização não governamental composta por representantes de organismos de padronização de diversos países.

As normas ISO abrangem uma ampla variedade de setores e disciplinas, e são projetadas para ajudar as organizações a atenderem a requisitos específicos, melhorarem seus processos e produtos, aumentarem a eficiência e a segurança, e atingirem a excelência em suas operações. Algumas das áreas mais comuns abrangidas pelas normas ISO incluem:

De acordo com o Escritório de Direitos Autorais dos EUA, os indivíduos que violaram uma obra protegida por direitos autorais podem ser responsabilizados por danos legais de até US$ 30.000 por cada obra violada. Se a violação intencional for comprovada, esse valor pode ser aumentado para US $ 150.000 para cada trabalho infringido. Além disso, a violação de direitos autorais pode resultar em acusações criminais, com penalidades máximas por violação de contravenção sendo um ano de prisão e multa de US$ 100.000.

## [DevSecOps] Princípios da Segurança e o Ciclo de Vida da Informação
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/49c58cdb-2740-4d8d-89cb-58acdf9dc0bd" align="right" height="177">

A **segurança da informação** é um tema de extrema importância para a sustentabilidade e longevidade de uma organização, especialmente no contexto do mundo atual, que foca na digitalização das informações e na transformação digital.

Apesar das organizações já terem uma consciência bem consolidada de importância de cuidar da segurança interna e externa por elas gerenciadas, há por vezes dúvidas com relação à abrangência do termo segurança da informação, dos seus conceitos básicos, do seu real valor para a organização, bem como do seu ciclo de vida.

O conhecimento dos conceitos básicos sobre segurança da informação é a base para que seja possível formular a segurança da informação de forma adequada, contemplando não apenas as questões lógicas, realizadas pelos softwares, mas também os aspectos físicos ligados à segurança da informação, bem como o controle de acesso.

Ao longo deste conteúdo vamos detalhar os conceitos básicos de segurança da informação, os diferentes tipos de segurança e da importância do controle de acesso. Serão apresentados, também, aplicação prática para que possamos visualizar o que de fato uma organização precisa fazer para garantir a segurança das informações por ela produzida, gerida ou tratada.

As **informações** são o conjunto de campos e registros, através delas temos as **métricas**, são iguais aos cabeçalhos e rodapés que possuem em um documento. Portanto, são dados que são agregados, fornecem mais contexto e organizados em um formato compreensível. Informação é algo que você vê em visualizações de dados e relatórios. As informações precisam ser estudadas, questionadas e organizadas para se obter um **insight**, pois ela tem um peso essencial hoje em dia para auxiliar pessoas e empresas na tomada de decisões. 

> As **métricas** são medidas quantitativas ou qualitativas que são usadas para avaliar, quantificar, monitorar ou descrever diferentes aspectos de uma situação, processo, sistema, produto ou desempenho. Elas são amplamente usadas em uma variedade de campos, incluindo negócios, ciência, engenharia, tecnologia, saúde, e muitos outros. Métricas ajudam a tornar informações complexas mais compreensíveis e permitem tomar decisões informadas com base em dados mensuráveis. E, portanto, ajudam você a entender o que dá certo ou não no seu trabalho e elas precisam ser o ponto de partida para qualquer estratégia de negócio.

**Exemplo**: um gráfico de visualização de dados mostrando a evolução no tempo de entrega para clientes de determinada região nos últimos 5 anos. Através disso podemos ter um insight dessa análise.

> Um **insight** é a compreensão ou conclusão de uma causa e efeito específicos dentro de um contexto particular. É, portanto, uma palavrinha de ouro na análise de dados, nela se concentra toda a expectativa de encontrar soluções essenciais para elaborar estratégias e emancipar as tomadas de decisão. Afinal, os insights estão diretamente ligados aos investimentos da organização e são obtidos após analisar informações e tirar conclusões. Exemplo: ao incorporar uma nova tecnologia, seria possível reduzir o tempo de entrega na região analisada em 10%.

Existem também, classificação das informações de acordo com:

- A importância delas para o negócio.
- Os requisitos legais.
- Os potenciais impactos gerados caso elas sejam acessadas, divulgadas, modificadas ou excluídas de forma indevida.

Existem níveis de classificação da informação com sensibilidade adotadas na empresa:

- **Confidencial**: é sensível ou estratégica para a empresa, apenas um grupo bem pequeno de pessoas deve ter acesso a ela. O acesso não autorizado a esse tipo de informação pode gerar grandes prejuízos financeiros, penalidades previstas em leis e regularmentos e causar danos à marca e inviabilizar a continuidade do negócio relacionado a marca, um bom exemplo são com materiais inéditos, por isso é bom restringi-la a somente poucas pessoas de confiança na equipe, como líderes e gestores;

- **Restrita**: é aquela que carrega algum valor, conhecimento ou relevância em torno de um tema. O acesso não autorizado a ela pode impactar uma ou mais áreas e gerar perda de competitividade para a empresa, por isso ela deve ser limitada as equipes e aos grupos de trabalho, um bom exemplo são informações sobre projetos;

- **Interna**: tem baixa sensibilidade e pode ser divulgada entre todos os colaboradores e podem circular entre colaboradores e pessoas autorizadas, como comentários do programa "Uma só Globo";

- **Pública**: são do conhecimento de todos, sem problema nenhum de divulgar, seja da empresa ou não.

Portanto, Por se tratar de um dado contextualizado, a informação possui o seguinte ciclo de vida: criação, transporte, manuseio e descarte.

A **criação** da informação abrange a geração e coleta das informações que podem vir de múltiplas fontes externas, situações essa muito comuns como a do tipo cliente-servidor, de computação distribuída e de Big Data onde o dado pode ser transportado ou manuseado. 

Já o **transporte** se refere a transferência da informação de um ponto de origem para um ponto de destino, a partir daqui precisamos ficar bem alertas com o sistema de segurança como confidencialidade e garantia de qualidade dos dados.

> A ordem do ciclo representa o transporte antes do manuseio por tal procedimento ser o mais comum nesses casos, porém é perfeitamente possível que ele seja manuseado anteriormente. Na etapa final, a informação é descartada.

O **manuseio** é a etapa que faz o tratamento e manipulações que podemos realizar com a informação e por fim o descarte que se refere a todas as ações que precisamos realizar para eliminar uma informação como verificar o período em que ela deve ser mantida antes de ser eliminada e quais cuidados devem ser tomados para evitar que no momento de eliminação a informação não seja acessada por mais ninguém.

E, por fim, o **descarte** que se refere a todas as ações que precisamos realizar para eliminar uma informação como verificar um período em que ela deve ser mantida antes de ser eliminada e quais cuidados devem ser tomados para dentro de eliminação a informação não seja acessada por mais ninguém.

Durante todas essas etapas, a informação deve ser protegida. Seu vazamento em quaisquer etapas pode provocar problemas em vários aspectos. Vamos analisar as seguintes hipóteses:

- Transporte inadequado de dados por uma transportadora que não realiza todos os procedimentos de segurança necessários.

- Laptop levado para a manutenção sem que os dados do disco rígido dele sejam protegidos. Não é raro haver casos de roubos de unidades que possuíam informações sensíveis de empresas.

- Analista de dados tem um laptop e um disco rígido externo roubados em sua residência com informações, não criptografadas, de 26,5 milhões de veteranos do exército americano. Ele informou que rotineiramente levava os dados para a sua residência. Neste caso, o problema ocorreu no manuseio da informação.

- Empresa forense de Nova Iorque, a Kessler International realizou o seguinte estudo: durante seis meses, ela foi adquirindo discos rígidos usados no portal eBay. Cerca de 40% deles continham informações de seus usuários.

- Facebook, uma das companhias mais novas do mercado de tecnologia e com um altíssimo valor agregado, sendo usado por milhões de pessoas no mundo, teve um disco rígido furtado de um veículo. Ele continha informações de aproximadamente 29.000 empregados norte-americanos.

Que conclusão podemos tirar dos casos apresentados? A informação, que é o dado contextualizado, precisa de proteção em todo o seu ciclo de vida. A partir dos exemplos citados, conseguimos entender a necessidade de sempre estabelecer uma proteção adequada dela em qualquer etapa do seu ciclo de vida.

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/08dfc273-7908-42b3-aa04-c23a6d35df43" height="377" align="right">

No caso do transporte de mídias magnéticas contendo informações sigilosas de usuários de determinada empresa, por exemplo, uma boa proteção é o emprego da **criptografia**, que pode ser definida como o embaralhamento das informações por meio de uma sequência de dados que utiliza uma chave e um algoritmo. Esta chave é usada para embaralhar (criptografar) e desembaralhar (decriptografar) as informações.

> A **criptografia** é a prática de proteger informações sensíveis e comunicações por meio da conversão desses dados em um formato ilegível, chamado "texto cifrado" (Cipher text), usando algoritmos matemáticos e chaves. A criptografia é uma técnica fundamental na segurança da informação e é usada para garantir a confidencialidade, a integridade e a autenticidade dos dados. A criptografia é uma área vasta e em constante evolução, com uma grande variedade de algoritmos disponíveis para diferentes finalidades e contextos.

Quando a mesma chave é usada nas duas etapas, a criptografia é dita **simétrica**; quando são usadas chaves distintas, ela é **assimétrica**. Vejamos os exemplos nas imagens a seguir:

A **criptografia simétrica** é um método de criptografia em que a mesma chave é usada tanto para criptografar quanto para descriptografar os dados. Isso significa que o remetente e o destinatário de uma mensagem usam a mesma chave secreta para garantir a confidencialidade dos dados.

Aqui está como a criptografia simétrica funciona:

1. **Chave Compartilhada**: Duas partes que desejam se comunicar secretamente concordam em uma chave secreta compartilhada. Esta chave é usada para cifrar os dados antes de serem transmitidos.

2. **Cifragem**: O remetente usa a chave compartilhada para cifrar os dados. Isso significa que os dados originais são transformados em uma forma ilegível, conhecida como texto cifrado.

3. **Transmissão**: Os dados cifrados são transmitidos pela rede para o destinatário.

4. **Descriptografia**: O destinatário usa a mesma chave compartilhada para descriptografar os dados cifrados, convertendo-os de volta ao formato original.

![img-2](https://github.com/IsaacAlves7/DevSecOps/assets/61624336/8f272a41-0ab3-494a-8943-913d1c46ad84)

A principal vantagem da criptografia simétrica é a eficiência. Ela é mais rápida em comparação com a criptografia assimétrica (ou de chave pública), que envolve o uso de pares de chaves pública e privada. No entanto, há um desafio significativo com a criptografia simétrica: como compartilhar a chave secreta de forma segura. Se um atacante interceptar a chave durante a transmissão, toda a segurança é comprometida.

Para superar esse desafio, é comum que as partes utilizem protocolos seguros para compartilhar a chave simétrica, ou a chave simétrica em si é criptografada usando a criptografia assimétrica durante a transmissão. Essa abordagem combina as vantagens da criptografia simétrica (velocidade) com as vantagens da criptografia assimétrica (compartilhamento seguro de chaves).

A criptografia simétrica é amplamente utilizada em cenários em que a segurança e a eficiência são cruciais, como na criptografia de tráfego de rede, criptografia de dados em armazenamento e criptografia de comunicações de voz ou vídeo.

Existem vários algoritmos amplamente usados para criptografia simétrica, que envolve o uso de uma única chave para cifrar e decifrar dados. Alguns dos algoritmos de criptografia simétrica mais conhecidos incluem:

- AES (Advanced Encryption Standard): O AES é um dos algoritmos de criptografia simétrica mais amplamente adotados e é amplamente utilizado em todo o mundo para criptografar dados. Ele oferece uma forte segurança e eficiência computacional. O AES tem diferentes tamanhos de chave, como 128 bits, 192 bits e 256 bits, com 256 bits sendo o mais seguro.

- DES (Data Encryption Standard): O DES foi um dos primeiros algoritmos amplamente adotados, mas hoje é considerado relativamente fraco devido ao tamanho de chave fixo de 56 bits. Ele foi substituído em grande parte pelo AES, mas ainda é usado em alguns contextos.

- 3DES (Triple Data Encryption Standard): O 3DES é uma versão aprimorada do DES que aplica o algoritmo DES três vezes para aumentar a segurança. Embora seja mais seguro que o DES padrão, ele é menos eficiente que o AES e é usado principalmente em cenários legados.

- RC4: O RC4 é um algoritmo de criptografia de fluxo que já foi amplamente utilizado, especialmente em aplicações de segurança de rede, mas não é mais considerado seguro devido a vulnerabilidades.

- Blowfish: O Blowfish é outro algoritmo de criptografia simétrica que é considerado seguro e eficiente. Ele é usado em algumas aplicações de segurança.

- Twofish: O Twofish é uma variação do Blowfish que oferece segurança adicional e é usado em algumas aplicações de criptografia.

- IDEA:

A escolha do algoritmo de criptografia simétrica depende das necessidades de segurança, eficiência e compatibilidade da aplicação. Atualmente, o AES é o algoritmo mais amplamente recomendado e usado para criptografia simétrica devido à sua segurança e eficiência. O tamanho da chave AES escolhido depende do nível desejado de segurança, sendo 256 bits a opção mais segura. A criptografia simétrica é comumente usada para criptografar dados em repouso, comunicações seguras e proteção de arquivos.

A **criptografia assimétrica**, também conhecida como criptografia de chave pública, é um método de criptografia que utiliza um par de chaves relacionadas, uma chave pública e uma chave privada, para proteger a confidencialidade e a integridade dos dados. Cada chave tem uma função específica:

![img-6](https://github.com/IsaacAlves7/DevSecOps/assets/61624336/71567d3c-a4a7-47a2-a34f-531be9a4bef1)

1. **Chave Pública**: Esta chave é amplamente distribuída e pode ser compartilhada com qualquer pessoa. Ela é usada para criptografar mensagens que somente a chave privada correspondente poderá descriptografar.

2. **Chave Privada**: Esta chave é mantida em sigilo e conhecida apenas pelo destinatário. Ela é usada para descriptografar mensagens que foram criptografadas com a chave pública correspondente.

Aqui está como a criptografia assimétrica funciona:

1. **Criação do Par de Chaves**: O destinatário gera um par de chaves, uma chave pública e uma chave privada. A chave pública é compartilhada publicamente, enquanto a chave privada é mantida em segredo.

2. **Cifragem**: Quando o remetente deseja enviar uma mensagem segura para o destinatário, ele utiliza a chave pública do destinatário para criptografar a mensagem.

3. **Transmissão**: A mensagem cifrada é transmitida pela rede para o destinatário.

4. **Descriptografia**: O destinatário utiliza sua chave privada correspondente para descriptografar a mensagem e recuperar o conteúdo original.

A criptografia assimétrica oferece várias vantagens:

- **Compartilhamento Seguro de Chaves**: Como a chave pública pode ser compartilhada amplamente, não é necessário compartilhar a chave privada. Isso elimina o desafio de compartilhar chaves secretas de forma segura.

- **Autenticação**: As chaves privadas podem ser usadas para assinar digitalmente mensagens, permitindo que o remetente prove sua identidade.

- **Segurança de Redes**: É amplamente utilizado para segurança de redes, autenticação, assinatura digital e criptografia de e-mails.

No entanto, a criptografia assimétrica é mais computacionalmente intensiva do que a criptografia simétrica, tornando-a mais lenta para criptografar e descriptografar dados. Portanto, é comum usar criptografia assimétrica para estabelecer uma comunicação segura inicial e, em seguida, usar criptografia simétrica para a transferência de dados eficiente. Essa abordagem é chamada de "criptografia híbrida."

Além disso, a proteção da chave privada é de extrema importância na criptografia assimétrica, pois, se a chave privada for comprometida, a segurança de todo o sistema fica em risco.

Os algoritmos usados para chaves assimétricas (ou criptografia de chave pública) incluem vários padrões de criptografia, cada um com seu próprio par de algoritmos relacionados, um para criptografar (chave pública) e outro para descriptografar (chave privada). Alguns dos algoritmos de criptografia assimétrica mais comuns incluem:

- RSA (Rivest-Shamir-Adleman): O RSA é um dos algoritmos de criptografia assimétrica mais amplamente usados e é baseado na dificuldade de fatorar números inteiros grandes em seus números primos constituintes. É usado para criptografia, assinaturas digitais e autenticação.

- DSA (Digital Signature Algorithm): O DSA é um algoritmo de assinatura digital amplamente utilizado. Ele foi projetado especificamente para assinar mensagens e verificar a autenticidade das mensagens.

- DAS

- ECDSA (Elliptic Curve Digital Signature Algorithm): O ECDSA é uma variante do DSA que utiliza curvas elípticas em vez de números inteiros grandes. É amplamente usado para assinaturas digitais em aplicativos móveis e IoT.

- ElGamal: O ElGamal é um algoritmo de criptografia de chave pública que é usado principalmente para criptografia e compartilhamento de segredos. É baseado na dificuldade de calcular logaritmos discretos em grupos multiplicativos finitos.

- Diffie-Hellman: Embora seja mais conhecido por seu uso em acordos de chaves, o Diffie-Hellman também é um algoritmo de criptografia de chave pública. Ele é usado para criar acordos de chaves compartilhadas entre duas partes.

- ECC (Elliptic Curve Cryptography): A ECC é uma família de algoritmos de criptografia de chave pública que se baseia no uso de curvas elípticas. Ela é conhecida por sua eficiência computacional e é frequentemente usada em dispositivos com recursos limitados.

- PKC

Cada um desses algoritmos tem suas próprias características e forças. A escolha do algoritmo depende das necessidades específicas de segurança, eficiência e aplicação. RSA e ECC são dois dos algoritmos mais amplamente utilizados em muitos cenários de criptografia de chave pública, enquanto DSA é comum para assinaturas digitais, e Diffie-Hellman é usado para acordos de chaves em comunicações seguras. A escolha do algoritmo é geralmente ditada por considerações de segurança, eficiência e interoperabilidade.

> **Curiosidade**: Em relação a criptografia, muitos devs se confundem sobre os seus algoritmos, em resumo <a href="https://www.base64decode.org/">Base64</a> e <a href="">funções hash</a> são conceitos diferentes dos algoritmos de criptografia, portanto Base64 e funções hash não são algoritmos de criptografia, mas sim técnicas relacionadas à representação e verificação de dados, cada um com um propósito distinto, a Base64 é usado para codificar dados binários em formato legível, enquanto funções hash são usadas para criar valores hash irreversíveis para verificar a integridade dos dados. Criptografia, por sua vez, é uma técnica mais abrangente que visa proteger tanto a confidencialidade quanto a integridade dos dados. Cada um desses conceitos tem seu próprio papel e aplicação específica na segurança e na representação de dados.

Como você manuseia seu pen drive? Hoje em dia, por estarmos na era da informação, é comum sempre levarmos um desses dispositivos no bolso, mochila ou na carteira. Afinal, como você cuida das suas informações?

Certamente, seu pen drive contém alguns arquivos nos quais você ainda deve estar trabalhando. Ele pode servir para várias pessoas e diferentes tipos de trabalho, como:

- Se você é um programador, pode estar mexendo em alguma parte de um sistema que está desenvolvendo.
- Se você trabalha na direção, pode estar atualizando alguma planilha com os dados financeiros da sua empresa.

Uma prática simples - mas eficiente - nestes casos é simplesmente compactar os seus arquivos usando uma senha, veja:

- Mais inseguro: Arquivos no pen drive sem senha.

- Menos inseguro: Arquivo compactado contendo todos os arquivos com senha.

Praticamente todas as ferramentas (até mesmo as gratuitas) possuem essa funcionalidade. Cada uma conta com uma metodologia para acrescer a senha ao processo de compactação. Um bom exemplo disso é a ferramenta 7-zip.

Essas ferramentas utilizam os melhores algoritmos de criptografia existentes no mercado. Além de economizar o espaço do pen drive, essa simples prática cria ainda uma camada de proteção para as informações contidas no dispositivo.

Devemos observar que a proteção e a facilidade caminham em direções contrárias. Por isso, o processo de compactar com senha gera um aumento de tempo no manuseio da informação, pois ele sempre torna necessária a tarefa de descompactar e compactar para tratar a informação. Dessa forma, seu descarte deve ser realizado de forma padronizada, já que o propósito é evitar a recuperação de suas informações. Exemplo: pen drives, discos rígidos e outras mídias usadas precisam ser descartadas com o uso de trituradores adequados. 

A segurança da informação possui três pilares principais que são aspectos importantes da informação que requerem cuidados especiais:

- **Confidencialidade**: Capacidade do acesso à informação apenas para quem possui autorização.

- **Integridade**: Possibilidade de alteração da informação por pessoas ou sistemas autorizados.

- **Disponibilidade**: Faculdade de a informação poder ser acessada, em qualquer tempo, por pessoas ou sistemas autorizados para tal.

Citados por diversos autores como pilares, estes três aspectos correspondem à prioridade do que deve ser protegido em relação à informação. Todos os exemplos citados correspondem à confidencialidade da informação em três momentos diferentes do seu ciclo de vida.

Portanto, a segurança da informação pode ser definida como as atividades, os procedimentos e as metodologias que objetivam a proteção da informação, principalmente no que tange à confidencialidade, integridade e disponibilidade (CID).

Os aspectos seguintes, contudo, também são considerados importantes:

- **Autenticidade**: Assegura que a informação foi gerada por pessoa ou sistema autorizado para isso.

- **Legalidade**: Alinha informação e/ou dos processos com normas, portarias, leis e quaisquer outros documentos normativos, cada um na sua respectiva esfera de atribuição e abrangência.

- **Não repúdio**: Relaciona-se ao fato de o emissor negar a autoria de uma informação divulgada. Também é conhecido como **irretratabilidade**.

Juntos, todos eles compõem os principais aspectos empregados pelos controles - ou pelas ferramentas que proporcionam a segurança da informação - para proteger a informação. 

**Teoria na prática**:

Todas as profissões possuem suas características. Nós, que somos de TIC, precisaremos, uma hora ou outra, interagir com essas profissões e assegurar que tais características sejam cumpridas.

Uma das mais antigas profissões do mundo é a do médico. Aqueles que já fizeram o juramento de Hipócrates e sabem quão árdua é essa profissão estão cientes de que um de seus fundamentos é o sigilo entre médico e paciente.

Esse sigilo aparece transcrito no CFM 1605/2000 em adição ao Código de Processo Penal (1941, art. 207), que dispõe o seguinte: “São proibidas de depor as pessoas que, em razão de função, ministério, ofício ou profissão, devam guardar segredo, salvo se, desobrigadas pela parte interessada, quiserem dar o seu testemunho”. Isso reforça ainda mais a necessidade de proteção desses dados não apenas quanto à confidencialidade deles, mas também em relação à sua integridade.

No tocante à confidencialidade, como os administradores de banco de dados devem fazer para gerenciá-los, uma vez que eles podem manusear quaisquer dados armazenados em um SGBD?

> A resposta padrão a este questionamento cada vez mais comum é o uso de criptografia na base de dados sem que a chave (simétrica, pública ou privada) esteja em hard code, tampouco armazenada no BD ou no arquivo de computador.

## [DevSecOps] OWASP
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/afc0dbaf-6bd1-442d-a3b4-730a01e2ae45" height="77" align="right">

A **OWASP** (**O**pen **W**eb **A**pplication **S**ecurity **P**roject) é uma organização sem fins lucrativos dedicada a melhorar a segurança de software. A missão da OWASP é tornar o software mais seguro, fornecendo informações e recursos para que as organizações e desenvolvedores possam proteger suas aplicações contra ameaças de segurança.

A OWASP realiza uma série de atividades para atingir seus objetivos, incluindo:

1. Desenvolvimento de Documentação: A OWASP produz guias, documentos e recursos que descrevem as melhores práticas em segurança de aplicativos da web. Um de seus projetos mais conhecidos é o "Top Ten Project", que lista as dez principais ameaças de segurança de aplicativos da web.

2. Ferramentas de Segurança: A organização mantém projetos de código aberto que fornecem ferramentas e bibliotecas para ajudar os desenvolvedores a identificar e corrigir vulnerabilidades de segurança em seus aplicativos.

3. Conferências e Treinamentos: A OWASP realiza conferências, eventos e treinamentos em todo o mundo para promover a conscientização e a educação em segurança de aplicativos da web.

4. Comunidade e Colaboração: A OWASP é uma comunidade global que reúne especialistas, pesquisadores e profissionais de segurança de aplicativos da web para colaborar e compartilhar conhecimento.

Em resumo, a OWASP é uma referência importante no campo da segurança de aplicativos da web, e seu trabalho desempenha um papel crucial na melhoria da segurança de software em todo o mundo, ajudando a identificar e mitigar ameaças de segurança comuns em aplicações da web.

A **atividade de planejamento** tem diversos desafios, como o detalhamento das regras de negócio, escolha da linguagem de programação, alocação de equipe, gestão de recursos e estabelecimento de cronograma. Além disso, outras atividades fazem parte do projeto e são bastante complexas, como a detecção e correção de vulnerabilidades.

O ideal é **criar um programa sem vulnerabilidades**. No entanto, esta é uma tarefa muito difícil de ser obtida. Muitas dessas vulnerabilidades já são de domínio público e, portanto, com o devido planejamento e treinamento da equipe, é possível mapeá-las e fazer o devido tratamento. Algumas dessas vulnerabilidades estão associadas a escolhas da arquitetura do sistema e podem conduzir a erros (bugs).

O processo de desenvolvimento de software é complexo. Para atender os prazos, às vezes, algumas etapas não são executadas da melhor forma. Quando essa decisão é tomada conscientemente, ela é chamada de débito técnico (será tratada posteriormente em um momento oportuno).

No entanto, algumas partes podem seguir adiante sem a devida observação. São as chamadas vulnerabilidades que são pontos fracos no projeto.

Elas podem ter sido deixadas por descuido dos programadores – por falta de tempo adequado para analisar o código, ou mesmo por falta de conhecimento técnico para programar determinado módulo – ou, em uma situação mais perigosa, foram deixadas para serem exploradas de forma fraudulenta.

De qualquer modo, sempre que existirem vulnerabilidades em um sistema, existirão riscos para os que o utilizam, tanto prestadores de serviço como usuários.

> Existem muitas ações fraudulentas que já são devidamente mapeadas, mas que, ainda assim, são aplicadas constantemente. Muitos desses ataques atingem os seus objetivos. Do ponto de vista dos desenvolvedores de software”, é necessário investir em treinamento e direcionamento para evitar que tais vulnerabilidades ocorram.
Do ponto de vista de gestores, é necessário incluir tempo para efetuar testes específicos para evitar que tais fragilidades estejam no sistema, e tratar do tema de forma explícita com a incorporação no projeto das melhores práticas já conhecidas.

É importante identificar as vulnerabilidades associadas ao desenvolvimento de software”, pois enquanto estiverem presentes o sistema e os dados dos usuários estarão em risco. A maioria das vulnerabilidades de segurança de software” é causada por tipos conhecidos de defeitos de software”, e a maioria de suas vulnerabilidades surge de causas comuns. (HOUSEHOLDER et al, 2017).

Uma forma de identificar essas vulnerabilidades é pesquisar pelas listas das principais vulnerabilidades disponíveis em domínio público. Algumas das fontes mais conhecidas de vulnerabilidade incluem:

- Banco de dados nacional de vulnerabilidades (INFORMATION TECHNOLOGY LABORATORY, 2020);
- SANS Top 20 (CIS Critical Security Controls, 2020).

Além disso, temos outras listas de vulnerabilidade. Veja:

- Injeção (Injection);
- Autenticação quebrada (Broken Authentication);
- Exposição de dados confidenciais (Sensitive Data Exposure);
- Entidades externas XML (XML External Entities);
- Controle de acesso quebrado (Broken Access Control);
- Configuração incorreta de segurança (Security Misconfiguration);
- XSS de script entre sites (Cross-Site Scripting XSS);
- Desserialização insegura (Insecure Deserialization);
- Usando componentes com vulnerabilidades conhecidas;
- Registro e monitoramento insuficientes (Insufficient Logging & Monitoring).

**[OWASP] Vulnerabilidades do lado do servidor**:

- Aplicativos da Web;
- Serviços de Sistema Operacional: Windows, UNIX e Mac OS;
- software de backup;
- software antivírus;
- Servidores de gerenciamento;
- software de banco de dados.

**[OWASP] Vulnerabilidades do lado do cliente**:

- Navegadores da Web;
- software de escritório;
- software de e-mail;
- Media players.

**[OWASP] Vulnerabilidades de políticas de segurança**:

- Direitos de usuário excessivos nos sistemas;
- Conectar dispositivos não autorizados nos sistemas da empresa;
- Exposição a e-mails maliciosos (Phishing).

**[OWASP] Vulnerabilidades de aplicativos**:

- Aplicativos de mensagens instantâneas;
- Aplicativos de compartilhamento ponto a ponto (bluetooth).

> Há ainda Ataques do dia Zero, uma vulnerabilidade de segurança que ainda não é tão conhecida e, portanto, não foi corrigida. Portanto, as vulnerabilidades estão relacionadas tanto com questões técnicas como com políticas de segurança.

Dada a complexidade dos projetos de desenvolvimento de software, o processo de identificação de vulnerabilidades não é trivial. É por isso que é tão importante que essa atividade seja contemplada no planejamento do projeto, para que a equipe seja treinada para detectar e corrigir essas vulnerabilidades, além de ter um direcionamento explícito de quais testes devem ser feitos.

Em especial, a OWASP está relacionada com questões técnicas. Um método para descobrir tais vulnerabilidades inclui revisões por pares e ferramentas de verificação de código. É fundamental que sejam feitos investimentos em treinamentos específicos para os membros da equipe.

A **capacitação dos desenvolvedores de software** é essencial para identificar e corrigir as vulnerabilidades dos sistemas. Além disso, deve-se fazer uso de programas e métodos para detectar vulnerabilidades, como, por exemplo:

**Revisão dos controles atuais**: As equipes de desenvolvimento, devidamente orientadas pela gerência do projeto, devem implementar recursos nos sistemas que reduzam o impacto das vulnerabilidades relacionadas aos controles de acesso, como, por exemplo, criar hierarquia de privilégios para que os usuários possam ter acesso a determinadas sessões do sistema.

## [DevSecOps] Segurança física, lógica e controle de acesso
A segurança da informação é uma das disciplinas e metodologias mais importantes atualmente, se você não levar a sério esse requisito as consequências podem ser desastrosas, como queda de patrimônio, prejuízo financeiro e de reputação e até ameaças de vida pessoal.

Vamos considerar um exemplo de cenário comum em uma área de segurança da informação, pense em uma empresa de pequeno porte que possui um servidor físico localizado em uma sala comercial sem grandes restrições de acesso, nesse servidor estão armazenados dados sobre contratos, prestações de serviço, números de chamado, pagamentos e reservas de um fornecedor. E para piorar esse cenário, a empresa não adota nenhuma política de backup. No caso da proteção do servidor é necessário um controle maior de gestão desse servidor e uso de proteção desse servidor como equipamentos de ar condicionado e extintor de incêndio para esse servidor.

Nosso papel mais concretamente é identificar situações de risco e propor soluções e melhorias, vamos fazer isso analisando os seguintes assuntos: Segurança física, segurança lógica e algoritmos de criptografia.

A **segurança física** trata da solução de equipamentos e da área que eles estão, então, aqui estamos preocupados por lidar com roubos e vandalismos, além de previnir, ou pelo menos minimizar os efeitos de desastres naturais e de danos acidentais como oscilações elétricas, temperaturas muito altas e desleixos de funcionários. Na segurança física o responsável por lidar com as padronizações e gestão de equipamentos é tanto o funcionário quanto o time de suporte da empresa.

A **segurança lógica** está relacionada a sistemas e programas de computadores específicos como antivírus, firewalls, VPNs e Proxies. No entanto, esse tipo de segurança também trata da identificação do usuário como autenticação e autorização com login e senha, verificação da força de uma senha, verificação e validação de campos de formulários, capitcha para identificar se não é um robô, verificação de usuário através do email ou SMS, 2FA ou MFA para reforçar a segurança da senha, direitos de acesso e autoridade e, também, aviso de aparelhos conectados e renovação de senha.

> A segurança física está relacionada ao acesso às instalações, enquanto a lógica trata somente dos algoritmos.

Ainda temos os **algoritmos de criptografia** que são uma forma de criptografar os dados através de sistemas complexos que o transformam para um formato que só pode ser recuperados porque tem a chave do algoritmo. 

No caso do exemplo acima de servidor físico é necessário criar uma política de segurança para que restrinja o acesso dos usuários aos sistemas e consequentemente aos dados e no caso dos dados isso pode ser feito com algoritmos de criptografia. Outro ponto muito importante é sobre **backup** que faz a cópia dos dados durante uma certa peridiocidade.

### [DevSecOps] Segurança física
Quando falamos em segurança da informação precisamos saber o contexto em que essa informação está armazenada e como acessá-la, por isso precisamos nos preocupar com restrições de acesso e minimizar riscos de situações que não estão no nosso controle como desastres naturais por exemplo.

Antes de se retratar das restrições em si, vamos responder a uma pergunta: - Onde os dados sensíveis devem ser armazenados? Certamente não devem ser em máquinas locais, mas sim em servidores dedicados para garantir a integridade, a confidencialidade e disponibilidade dos dados.

A **segurança física** pode ter diversos níveis e também é importante destacar que o excesso de cuidado também pode ser prejudicial, portanto é preciso que ajustemos os níveis de segurança para que aja compatibilidade com o que queremos proteger, por exemplo, com uma boa forma de se proteger na segurança física é usar catracas com reconhecimento biométrica ou com cartão de identificação que restrinja o acesso apenas para pessoas autorizadas.

A partir da pandemia ocorrida em 2020, os sistemas de acesso evoluíram para o uso de reconhecimento facial. Muitos desses sistemas possuem slogans bem criativos, como este: “Um sistema de acesso com reconhecimento facial permite levar a sua empresa diretamente para o mundo da alta tecnologia por meio do uso desta importante ferramenta de segurança física. Um sistema de acesso, independentemente do tipo de chave (senha) criado, permite o bloqueio físico a determinado local. Esta chave (senha), com o passar do tempo, vem evoluindo bastante: cartões com códigos de barra, tarja magnética, digital, veias da mão e, agora, reconhecimento facial.

> A segurança física está relacionada ao acesso às dependências das instalações, a lógica, aos algoritmos que protegem os dados do mundo exterior e de forma física. Portanto, os dispositivos de autenticação de biometria correspondem a itens capazes de oferecer controle ou proteção no âmbito da segurança física preventiva.

No módulo anterior, vimos o exemplo de roubo de dados no transporte. Mesmo que eles estivessem criptografados, a ação poderia ocorrer da mesma forma, pois ela foi uma consequência de vulnerabilidades na segurança física das mídias em questão. Assim, dois aspectos poderiam ser transgredidos:

- Integridade: Depende da informação ser ou não totalmente impactada, pois a mídia poderia ser destruída.

- Confidencialidade: Depende da informação armazenada ter ou não algum controle de proteção, como a criptografia.

A família de normas ABNT ISO/IEC 27.000 divide a segurança física em dois aspectos: um é relacionado aos equipamentos e o outro, ao ambiente.

A segurança da informação age dessa forma. Ela é entendida como camadas justapostas que permitem à informação ficar cada vez mais protegida. É como se nossa informação recebesse camadas de proteção similar a uma cebola.

Quanto ao ambiente, em uma instalação empresarial, por exemplo, é possível observar as camadas de segurança físicas e, a partir daí, estabelecer um paralelo com a imagem da cebola.

Imaginemos a seguinte situação: Ao nos aproximarmos de uma instalação, alcançamos a cancela para automóveis, que, geralmente, conta com dois seguranças. Sua função é solicitar identificação ou verificar se o veículo possui algum selo de identificação. Normalmente, esse selo é único para aquela instituição. Em alguns casos, essa verificação pode ser feita de forma automatizada com alguma tecnologia de emissão de sinal de baixa frequência, como o RFID.

Após a ultrapassagem dessa primeira barreira (camada mais externa à nossa cebola de segurança), geralmente existe mais uma etapa: catraca e elevador. Ela está vinculada a algum controle biométrico ou de crachá. O RFID novamente surge como um exemplo.

Esses controles físicos são justapostos, permitindo que a vulnerabilidade de um deles possa ser recoberta por outro controle. Isso funciona de forma similar nas salas de servidores, data centers e salas-cofres, criando camadas de segurança que dificultam o acesso físico ao servidor.

Outro aspecto que deve ser levado em consideração é a proteção contra ameaças da natureza, como enchentes, incêndios e outras calamidades provocadas pela natureza e/ou pelo homem.

Tendo isso em vista, certos controles de monitoramento e prevenção devem ser instalados e controlados.

**Exemplo**: Câmeras de segurança, controles de temperatura, extintores de incêndio e sprinkles (algumas vezes traduzidos como chuveiros automáticos).

O cabeamento e o acesso à rede externa (internet), bem como ao fornecimento de energia, são fatores fundamentais nesse processo. Como eles dependem de um fornecimento feito por terceiros, certos aspectos contratuais e de redundância precisam ser estabelecidos.

Além disso, políticas e instruções normativas devem ser instituídas, treinadas e simuladas visando à prontidão. Nesse sentido, é razoável haver uma redundância no fornecimento de rede (internet), bem como uma independência física desse fornecimento no que tange ao tipo de conexão estipulada. Veja:

É necessário evitar o uso compartilhado de conexões entre fornecedores distintos. Desse modo, se, para um fornecedor, a conexão é feita por meio de fibra ótica, para o outro ela poderia ser realizada por intermédio de link rádio.

É necessário, sobre a parte de energia elétrica, o uso de bancos de bateria (e/ou _no-breaks_) e de geradores. Quanto aos geradores, deve-se levar em consideração o fornecimento de insumos necessários e periódicos, como o combustível.

É necessário adotar medidas como senha na BIOS e configuração de botões físicos e de ordem de execução na inicialização dos computadores, pois em relação aos equipamentos, a ideia de segurança tem a ver com o acesso físico aos componentes de hardware e aos dispositivos de entrada. 

Os maiores computadores do mundo são organizados em uma lista conhecida como Top 500 (top500.org). Pelo custo e poder computacional deles, esses equipamentos requerem uma série de recursos de proteção.

Maior recurso computacional do Brasil, o supercomputador Santos Dumont consta nessa lista. Para prover os recursos necessários de segurança, uma série de medidas foi tomada e, em seguida, publicada no Youtube.

As **instalações físicas** devem possuir seguranças justapostas de forma que a fraqueza de uma camada possa ser recoberta por outra. Essa lógica fica clara no funcionamento de guaritas, cancelas e sensores biométricos.

Convém que sejam utilizados perímetros de segurança (barreiras, como paredes, portões de entrada controlados por cartão ou balcões de recepção com recepcionistas) para proteger as áreas que contenham informações e instalações de processamento da informação. Além disso, que sejam levadas em consideração e implementadas as seguintes diretrizes para perímetros de segurança física, quando apropriado:

I. Os perímetros de segurança devem ser claramente definidos, assim como a localização e capacidade de resistência de cada perímetro precisam depender dos requisitos de segurança dos ativos existentes no interior do perímetro e dos resultados da análise/avaliação de riscos.

II. Os perímetros de um edifício ou de um local que contenha instalações de processamento da informação precisam ser fisicamente sólidos (ou seja, o perímetro não deve ter brechas nem pontos onde poderia ocorrer facilmente uma invasão).

III. Deve-se implantar uma área de recepção ou outro meio para controlar o acesso físico ao local ou ao edifício. Esse acesso deve ficar restrito somente ao pessoal autorizado.

IV. Devem ser construídas barreiras físicas para impedir o acesso físico não autorizado e a contaminação do meio ambiente.

### [DevSecOps] Segurança lógica - Medidas baseadas em software
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/5df8c705-7f64-4e13-becb-a278cffeefce" align="right" height="177">

Em adição às medidas de segurança física, há as de segurança lógica, que correspondem às medidas baseadas em software. Dessa lista, podemos destacar as senhas, as listas de controle de acesso, a criptografia, e o firewall.

Repetindo o padrão já apresentado, esses mecanismos estão justapostos, isto é, intercalados entre si. Dessa forma, a demanda de uma camada pode criar uma adicional a outra que possua alguma vulnerabilidade particular.

Como exemplo disso, existem no próprio equipamento controles de acessos biométricos, como a leitura de digital e o reconhecimento facial. Esses sistemas de controle biométricos são caracterizados pela captura da geometria humana, a qual, em grande parte, difere em cada pessoa.

Atualmente, os leitores de digitais têm dado espaço para o reconhecimento facial pela disseminação dos sensores e da tecnologia empregada. Há diversas APIs disponibilizadas para uso gratuito e comercial, como a API do **Amazon Rekognition**. Esses controles atuam na proteção da confidencialidade da informação.

A **criptografia** corresponde ao conjunto de técnicas que permite o embaralhamento de dados por intermédio do uso de chaves e de algoritmos computacionais baseados em funções matemáticas. Essas funções propiciam, em linhas gerais, a presença de duas grandes classes de algoritmos: os simétricos e os assimétricos. Vejamos!

#### [DevSecOps] Segurança lógica - criptografia simétrica
Utiliza funções matemáticas mais simples e uma única chave para criptografar e decriptografar. Esta classe de algoritmos é composta por, entre outros exemplos, Cifra de César, Blowfish, Twofish e Rijnadel. Graças a esse controle, é possível assegurar a confidencialidade da informação. Veja o conjunto na tabela a seguir:

<table>
  <thead>
    <tr>
      <th>Algoritmo</th>
      <th>Tamanho da chave</th>
    </tr>
  </thead>
    <tbody>
        <tr>
          <td>AES (Rijnadel)</td>
          <td>128, 192 e 256 bits</td>
        </tr>
        <tr>
          <td>Twofish</td>
          <td>128, 192 e 256 bits</td>
        </tr>
        <tr>
          <td>Serpent</td>
          <td>128, 192 e 256 bits</td>
        </tr>
        <tr>
          <td>Blowfish</td>
          <td>32 a 448-bits</td>
        </tr>
        <tr>
          <td>RC4</td>
          <td>40-128 bits</td>
        </tr>
        <tr>
          <td>3DES (baseado no DES)</td>
          <td>168 bits</td>
        </tr>
        <tr>
          <td>IDEA</td>
          <td>128 bits</td>
        </tr>
   </tbody>
</table>

#### [DevSecOps] Segurança lógica - funções hash
MD5
SHA

https://recfaces.com/

#### [DevSecOps] Segurança lógica - criptografia assimétrica
Caracteriza-se por algoritmos que normalmente envolvem técnicas matemáticas mais sofisticadas, como a fatoração de números grandes e o logaritmo discreto. Esta família emprega duas chaves: uma é utilizada para cifrar; a outra, para decifrar - o que nos permite uma segurança maior. Tais chaves são conhecidas como:

- Pública: Fica disponibilizada em um servidor de confiança.

- Privada: Está sob a posse do usuário.

Com a combinação dessas chaves, é possível assegurar não somente a confidencialidade, mas também o não repúdio ou irretratabilidade. Afinal, pode-se combinar o uso desse controle tanto com a chave privada do emissor (não repúdio) quanto com a pública do destinatário (confidencialidade). Diffie-Hellman, El Gamal e Curvas Elípticas são alguns dos algoritmos dessa família. Quanto aos controles aplicados às redes, destacam-se os firewalls, os sistemas detectores de intrusão e os VPNs.

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/86189e08-6ac1-44a5-aa3e-903774fdeab4" align="right" height="177">

Esses controles permitem a criação de zonas de segurança dentro e fora da instituição. Tais zonas possibilitam a criação de segregações de funcionalidades. Das zonas de segurança, a mais comumente encontrada é a **DMZ - Zona desmilitarizada**, ela limita a região onde os servidores web e de aplicação podem ficar.

O **firewall** é um importante ativo de rede, desse modo, encontrá-lo em um projeto de rede torna-se imprescindível. Ele protege uma rede interna analisando e bloqueando, por meio de algoritmos proprietários de cada marca, o acesso e o transporte de dados para dentro dela. Por manipulá-los, este ativo é classificado como segurança lógica. Para proteger as redes de dados, as empresas criam perímetros de segurança formados por componentes que avaliam o tráfego de ingresso e egresso. O componente que utiliza listas de controle de acesso formadas por regras que determinam se um pacote pode ou não atravessar a barreira é o firewall usa as regras para criar barreiras e políticas relacionadas.

As regras dos firewalls podem seguir duas políticas:

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/26a6c60a-a69e-47c0-855b-1fba8af61583" align="right" height="177">

- Negar por padrão: Todo o tráfego é negado. Apenas os servidores e os protocolos são autorizados. Trata-se da política normalmente encontrada e recomendada no mercado. Como todos os tráfegos são negados, apenas podem trafegar os tráfegos cujas regras (R1) são aceitas.

- Aceitar por padrão: Todo o tráfego é autorizado, embora o destinado para determinados servidores seja negado. Qualquer tráfego é aceito por padrão. Regras específicas (R1 e R2) definem quais serão negados.

### [DevSecOps] Assinatura eletrônica
Outro ponto muito importante relacionado a criptografia é a **assinatura eletrônica** permite que pessoas e organizações assinem seus documentos, garantido maior confiabilidade. Essa assinatura pode ser feita, por exemplo, por meio de senha, biometria e assinatura digital. 

Uma assinatura eletrônica permite que um documento seja assinado por meio eletrônico, e isso pode ser feito de várias maneiras, podendo servir para diversas finalidades, como nos casos de advogados para peticionar, apresentar contestação, interpor recursos, entre outras possibilidades. Nesse cenário, a assinatura eletrônica que deve ser feita com o auxílio de criptografia, chaves públicas e privadas, hash e também registros em uma autoridade certificadora, onde a assinatura digital é uma assinatura eletrônica registrada em autoridade certificadora (AC) por meio de um certificado digital, que permite a verificação da identidade. A assinatura por meio de certificado digital permite que pessoas e empresas assinem documentos digitalmente, garantindo que o valor dessa assinatura seja equivalente à assinatura de próprio punho.

Os conceitos deste experimento se aplicam a diversas áreas, podendo ser utilizados por pessoas físicas e jurídicas para confirmação da autenticidade de um documento ou transação, por exemplo. Podem ser citados como casos práticos de utilização da assinatura digital o e-CPF ou o e-CNPJ, com os quais é possível que pessoas físicas e jurídicas assinem documentos e contratos. Além disso, o certificado digital também pode ser utilizado para acesso a web services com autenticação SSL (secure sockets layer).

> A assinatura digital e assinatura eletrônica não são a mesma coisa, embora ambas sejam métodos de assinar documentos de forma eletrônica. Elas diferem em termos de tecnologia e nível de segurança. Embora a senha seja uma assinatura eletrônica, não é registrada em uma autoridade certificadora. Em princípio, o nome não é uma assinatura eletrônica e, dessa forma, não permite nenhuma validação.

<img src="https://upload.wikimedia.org/wikipedia/commons/7/78/Private_key_signing.svg" align="right" height="177">

A **assinatura digital** que garante a confiabilidade e validade da identidade de quem assinou um documento por um **certificado digital**. A assinatura digital é um tipo de assinatura eletrônica que utiliza criptografia para autenticar o autor de um documento ou mensagem. Ela envolve a criação de um par de chaves criptográficas, uma privada e outra pública. A chave privada é usada para assinar o documento, enquanto a chave pública é usada para verificar a assinatura. A assinatura digital é altamente segura e é geralmente reconhecida legalmente em muitos países. Ela garante a integridade do documento, autentica o remetente e impede a falsificação da assinatura. A assinatura digital é um tipo de assinatura eletrônica que envolve um conjunto de conceitos, como: chaves públicas e privadas, criptografia e hash. A assinatura digital permite validar a autenticidade de organizações, pessoas ou equipamentos, por exemplo. Uma assinatura digital é feita por meio de autoridade certificadora que emite um certificado digital, o qual pode ser utilizado para assinar digitalmente diversos tipos de documentos.

O hash é utilizado no processo de assinatura digital para permitir que o resumo da mensagem tenha um tamanho fixo, sempre gera uma cadeia de caracteres de tamanho fixo. A chave privada criptografa o hash, que é descriptografado pela chave pública. Com o intuito de validar a assinatura digital, é comparado o hash original com o hash descriptografado. 

Um certificado digital é um documento eletrônico que atesta a identidade de um indivíduo, organização, dispositivo ou serviço na internet. Ele é emitido por uma Autoridade Certificadora (AC) confiável e contém informações sobre a identidade do titular do certificado, bem como uma chave pública que é usada para fins de autenticação e criptografia. A autoridade registradora (AR) faz a etapa do registro, requerendo e validando os dados. Após isso, envia a solicitação da emissão do certificado para a autoridade certificadora (AC).

O processo descrito de obtenção e uso de um certificado digital envolve várias etapas, veja abaixo: 

1. Solicitação: O processo começa quando um indivíduo, organização ou entidade deseja obter um certificado digital. Eles precisam entrar em contato com uma Autoridade de Registro (AR) ou Autoridade Certificadora (AC) confiável para iniciar o processo.

2. Verificação de Identidade: A AR ou AC realizará um processo de verificação da identidade do solicitante. Isso pode envolver a apresentação de documentos de identificação, como carteira de identidade, passaporte, documentos comerciais, entre outros.

3. Geração de Par de Chaves: Após a verificação da identidade, o solicitante gera um par de chaves criptográficas. Esse par de chaves consiste em uma chave pública e uma chave privada. A chave privada é mantida em sigilo pelo titular do certificado, enquanto a chave pública é incluída no certificado.

4. Emissão do Certificado: Com a identidade verificada e o par de chaves gerado, a AC emite o certificado digital, que contém informações sobre o titular, sua chave pública e outros detalhes. O certificado é assinado digitalmente pela AC para garantir sua autenticidade.

5. Instalação e Uso: O titular do certificado digital instala o certificado em seu dispositivo, como um computador ou dispositivo móvel. A chave privada correspondente é armazenada com segurança. O certificado é usado para autenticar o titular em transações eletrônicas, assinar digitalmente documentos, criptografar e descriptografar mensagens, e garantir a segurança das comunicações online.

6. Renovação e Revogação: Certificados digitais têm uma data de validade. Periodicamente, o titular deve renovar o certificado para continuar a usá-lo.
Em casos de perda, comprometimento da chave privada ou outras circunstâncias de segurança, o certificado pode ser revogado para evitar o uso não autorizado.

Basicamente, o processo para conseguir um certificado digital passa por uma AC, que confere todos os dados do solicitante. Com os dados validados, a AC solicita a emissão do certificado digital para a AR. Somente após isso, é gerado um certificado digital que permite que documentos e transações sejam autenticados eletronicamente, tendo, inclusive para fins jurídicos, o mesmo valor da assinatura de próprio punho. 

Para conseguir um certificado digital, é necessário iniciar o processo requerendo o certificado a uma autoridade registradora. Depois, os dados são validados e enviados para a autoridade certificadora, que faz a emissão do certificado digital. As etapas são basicamente:

1. Requerer o certificado a uma autoridade registradora: O processo de obtenção de uma assinatura digital começa com o requerente (a pessoa ou entidade que deseja uma assinatura digital) solicitando um certificado digital a uma Autoridade de Registro (AR) autorizada. A AR é responsável por coletar as informações e documentos necessários do requerente.

2. Validação dos dados enviados: A AR encaminha o requerimento, juntamente com os documentos e informações coletados, para a Autoridade Certificadora (AC). A AC é a entidade responsável por emitir certificados digitais.

3. Envio do requerimento a uma autoridade certificadora: A AR encaminha o requerimento, juntamente com os documentos e informações coletados, para a Autoridade Certificadora (AC). A AC é a entidade responsável por emitir certificados digitais.

4. Emissão do certificado digital: Após a validação bem-sucedida dos dados, a AC emite o certificado digital. Esse certificado contém a chave pública do requerente, informações sobre a identidade do titular e a assinatura digital da AC para autenticidade.

Depois de obter o certificado digital por meio dessas etapas, o titular pode usá-lo para criar assinaturas digitais em documentos eletrônicos, garantindo a autenticidade e integridade dos mesmos. O processo de criação de uma assinatura digital com o certificado digital envolve a aplicação de técnicas criptográficas para produzir uma representação digital única da assinatura do titular em um documento eletrônico. Isso é importante para garantir a autenticidade e a integridade dos documentos assinados eletronicamente.

Exemplos de aplicações da assinatura digital utilizando o certificado digital são o e-CPF e o e-CNPJ, utilizados por pessoas físicas e jurídicas.

Um **algoritmo de assinatura**, em segurança da informação e criptografia, é uma técnica matemática que permite a geração de uma assinatura digital associada a um conjunto de dados ou mensagem. Essa assinatura digital é usada para verificar a autenticidade e a integridade dos dados, bem como a identidade do remetente. A assinatura digital é semelhante a uma assinatura manuscrita em documentos físicos, mas é usada em ambiente digital para garantir que a mensagem não tenha sido adulterada e que realmente tenha sido enviada pelo remetente pretendido. A autenticidade e a integridade são duas das principais propriedades fornecidas por um algoritmo de assinatura.

### [DevSecOps] Controle de acesso
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/1bb1fc03-b334-408a-add3-41869f2915e2" align="right" height="77">

As regras para um controle de acesso eficiente são:
 
1. Acesso apenas para pessoas autorizadas
2. Não fornecer dicas
3. Validar a entrada como um todo
4. Limitar as quantidades de tentativas de logon
5. Guardar as tentativas de acesso inválidas
6. Forçar um tempo de espera
7. Terminar as conexões com o sistema
8. Limitar o tempo para o procedimento de logon
9. Quando o procedimento de logon no sistema finalizar corretamente: data e hora do último logon com sucesso.

Os tipos de controle de acesso são:

- **DAC**: As autorizações são baseadas nas permissões de usuários ou grupos sem a preocupação da importância do documento. 
  
- **MAC**: As autorizações são baseadas nas permissões de usuários ou grupos e nos rótulos (labels) de um documento.

- **RBAC**: As autorizações são baseadas em papéis.

# 💙 Blue Team
<img src="https://user-images.githubusercontent.com/61624336/201539380-1a6d27de-5fbd-43e3-b57d-83fd1174646a.png" height="77" align="right">

O **Blue team** (equipe azul) que tem como foco a **defesa**, ou seja, simulam a defesa dos ataques de forma proativa e é responsável por atuar na defesa contra uma invasão. Então, caso uma aplicação sofra uma tentativa de invasão, o time azul entra em ação com o foco de impedir que essa ação tenha sucesso. Também é responsável por manter a segurança das aplicações, análise forense, trabalhar na infraestrutura, armazenamento de dados, gerenciamento de acessos e autenticações do sistema. Um importante aspecto do trabalho do time também é ser um disseminador da cultura de segurança, ajudando as pessoas da empresa a conhecerem e adotarem as políticas de segurança. Alguns exemplos de tarefas do dia a dia desse time são implementar autenticação de dois fatores, identificar ataques e invasões a sistemas. O Blue team fornece uma resposta aos incidentes relacionados a segurança, implementação de controles e proteção da infraestrutura, também buscam ameaças e fazem de forma ativa o monitoramento de segurança. Além disso, esses profissionais também têm como responsabilidade criar táticas com o objetivo de diminuir os impactos e prejuízos caso a empresa sofra problemas com a segurança.

O Blue Team lida diretamente com desenvolvimento seguro, segurança de aplicação e segurança da informação que são conceitos fundamentais na área de segurança cibernética e têm o objetivo de proteger sistemas, aplicativos e informações contra ameaças e vulnerabilidades. Aqui está uma explicação de cada um desses conceitos:

- **Secure Development**: O Desenvolvimento Seguro (DevSecOps) é uma abordagem que se concentra em projetar, desenvolver e manter sistemas e aplicativos de software com segurança desde o início. Isso envolve a integração de práticas e controles de segurança no processo de desenvolvimento, garantindo que as vulnerabilidades de segurança sejam identificadas e abordadas precocemente. As práticas de Desenvolvimento Seguro incluem análise de código seguro, testes de segurança, revisões de design, treinamento de desenvolvedores em segurança, entre outros. O objetivo é minimizar a exposição a ameaças de segurança e melhorar a qualidade e a confiabilidade do software. A Segurança da Informação é uma disciplina design para o DevSecOps, mais ampla que se concentra na proteção de informações em todas as suas formas, incluindo dados, sistemas, redes e processos. Isso envolve a implementação de controles de segurança, políticas, procedimentos e práticas para garantir a confidencialidade, integridade e disponibilidade das informações. Áreas de foco na Segurança da Informação incluem gerenciamento de riscos, políticas de segurança, conscientização do usuário, criptografia, monitoramento de segurança, resposta a incidentes e conformidade com regulamentações. O objetivo é garantir que as informações estejam seguras contra ameaças internas e externas.

- **Application Security**: A Segurança de Aplicação se concentra na proteção de aplicativos de software contra ameaças, ataques e explorações. Isso inclui a implementação de medidas de segurança específicas, como autenticação, autorização, criptografia, controle de acesso e validação de entrada, para proteger os aplicativos contra ameaças cibernéticas. Testes de segurança, análise de código e revisões de segurança são comuns na avaliação e melhoria da Segurança de Aplicação. O objetivo é garantir que os aplicativos sejam resistentes a ameaças e que os dados dos usuários estejam protegidos.

Em resumo, o Desenvolvimento Seguro se concentra na criação de software seguro desde o início, a Segurança de Aplicação aborda a proteção de aplicativos específicos e a Segurança da Informação lida com a proteção de informações em um contexto mais amplo. Todas essas disciplinas são fundamentais para garantir a segurança cibernética e proteger sistemas, aplicativos e dados contra ameaças cada vez mais sofisticadas.

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/c7eba071-265e-49d9-8b61-7ff55764fcb0" align="right" height="177">

Muitas empresas que possuem blue team utilizam a metodologia **PbD - Privacy by Design** (Privacidade por Design) que é um princípio de proteção de dados que enfatiza a integração de medidas de privacidade desde o início do design e desenvolvimento de produtos, sistemas e serviços. A ideia por trás do Privacy by Design é que a privacidade dos dados que deve ser considerada como parte integrante de qualquer novo projeto, em vez de ser uma consideração secundária ou uma correção posterior.

Alguns dos princípios e componentes-chave do Privacy by Design incluem:

- **Proatividade**: A privacidade deve ser considerada desde o início de um projeto, e não apenas como uma resposta a regulamentações ou incidentes de segurança.

- **Privacidade por Padrão**: Isso envolve projetar sistemas de forma que a privacidade seja a configuração padrão. Os usuários não devem ser forçados a tomar medidas extras para proteger sua privacidade.

- **Mínima Coleta de Dados**: Coletar apenas os dados necessários para o propósito específico e limitar a quantidade de dados pessoais processados.

- **Transparência**: Informar os usuários sobre como seus dados serão coletados, usados e protegidos. Isso envolve a criação de políticas de privacidade claras e compreensíveis.

- **Controle do Usuário**: Dar aos usuários controle sobre seus próprios dados, incluindo a capacidade de acessar, corrigir ou excluir seus dados.

- **Segurança de Dados**: Implementar medidas de segurança robustas para proteger os dados pessoais contra acessos não autorizados ou violações.

- **Avaliação de Impacto de Privacidade (PIA)**: Realizar Avaliações de Impacto de Privacidade para identificar e abordar riscos à privacidade em projetos que envolvam o processamento de dados pessoais.

- **Responsabilidade**: Designar um responsável pela proteção de dados na organização para garantir o cumprimento das políticas de privacidade e regulamentações.

O Privacy by Design é particularmente relevante em um ambiente de crescente conscientização sobre a privacidade e regulamentações rigorosas, como o Regulamento Geral de Proteção de Dados (GDPR) na União Europeia. Além de ser uma abordagem ética para o processamento de dados pessoais, também ajuda as organizações a reduzir riscos legais, aumentar a confiança do cliente e melhorar a segurança dos dados.

Ao adotar o Privacy by Design, as organizações podem demonstrar seu compromisso com a privacidade e desenvolver produtos e serviços que respeitam a privacidade dos indivíduos desde o início, em vez de correr o risco de correções e penalidades legais no futuro.

A informação é o que move a empresa! Com ela, nós produzimos:

- Experiências únicas;
- Novos formatos;
- Novos conteúdos;
- Novos produtos.

> Proteger a informação garante a competitividade e a sustentabilidade dos negócios da empresa. E a segurança da informação é um tema estratégico! 

A segurança da informação deve fazer parte de todas as suas atividades e independentemente da sua área ou função. E isso vale não só para os temas mais estratégicos, como também para as ações mais simples que você executa no dia a dia.

Por isso, é importante garantir que ela esteja presente:

- Nos e-mails que você envia;
- Nos arquivos que você compartilha;
- No trabalho que você faz;
- Nos projetos de que você participa.

> Quando falamos sobre segurança da informação, toda atitude conta!

As boas práticas de segurança da informação são:

- **Avisar quem participar de uma reunião sobre o nível de sigilo dos assuntos que serão tratados**: informe as pessoas que participarão da reunião sobre o nível de sigilo do que será abordado, reforçando o compromisso de confidencialidade com a Globo;

- **Consultar a área de Segurança da Informação quando seu projeto envolver uma iniciativa de tecnologia**: procure a área para garantir a segurança como parte do projeto, desde as etapas iniciais;

- **Ao ativar a câmera em uma videoconferência, ter cuidado com o que aparece por atrás de você**: observe quais informações podem ser vistas atrás de você. Para mais privacidade, desfoque o fundo ou escolha um personalizado. Atenção: assuntos sigilosos devem ser tratados em ambientes reservados, ok?

O que **não são** boas práticas de segurança da informação são:

- **Armazenar os arquivos finais de trabalho no computador**: use o OneDrive como sua área de trabalho pessoal. Assim, mesmo se algo acontecer com o seu computador, seus documentos estarão em segurança na nuvem. Para compartilhar arquivos com os times, escolha o *SharePoint* ou *Teams*;

- **Compartilhar seus arquivos com todas as pessoas que trabalham na empresa**: compartilhe informações apenas com as pessoas necessárias. Assim, você ajuda a garantir a segurança das informações do seu trabalho.

Você sabia que cada pessoa, de acordo com o perfil ou o cargo que ocupa na empresa, acessa diferentes informações? É sua responsabilidade solicitar e manter apenas os acessos necessários para o seu trabalho.

É papel do(a) gestor(a) garantir que os direitos de acesso das equipes estejam adequados. Para solicitar ou remover acessos, conheça o Local de Acesso da sua empresa. Quando você é transferido(a) de área, o(a) novo(a) gestor(a) deve revalidar os seus acessos, decidindo os privilégios que deverão ser mantidos ou removidos na nova função.

Você sabe o que são incidentes de segurança da informação? Eles são caracterizados por alertas, notificações, circunstâncias suspeitas ou reais evidências sobre falhas de segurança e perda de confidencialidade, integridade, disponibilidade e privacidade das informações. Esses incidentes podem ocorrer por fatores humanos, tecnológicos ou do ambiente.

Veja alguns exemplos:

- Violação ou não conformidade com políticas e normas de segurança da informação.
- Uso do login e da senha de outras pessoas.
- E-mails falsos (phishings).
- Vazamento de informação ou de conteúdo inédito.
- Acesso indevido a dados pessoais de consumidores.

> O **vazamento de informações** é uma grande preocupação para a grandes empresas. Ou seja, quando uma informação sai da empresa de forma indevida, muitos problemas podem acontecer. Por exemplo: estratégias vão por água abaixo, negócios são desfeitos, produções precisam ser regravadas, reportagens deixam de ser exibidas e a marca sofre danos.

> Já tivemos problemas com vazamentos de informações em todas as áreas. Vazamento de produtos, negócios e até de dados internos. E isso é grave!

> A responsabilidade com a proteção das informações é de cada um de nós. Por isso, é muito importante reconhecer a sensibilidade da informação que está em nossas mãos, tanto como colaboradores como também clientes precisam respeitar essa regra.

Os vazamentos são investigados pelo time de Resposta a Incidentes de Segurança da Informação e pela área de Compliance. Com base nas evidências e nos impactos gerados, as medidas a serem aplicadas aos responsáveis são definidas pela Comissão de Ética.

Incidentes precisam ser reportados para o correto tratamento e a redução dos possíveis impactos para a empresa. Neste caso, ao identificar o golpe, Carla também deveria ter trocado a senha imediatamente. Assim, se o(a) golpista tentasse utilizar a senha fornecida, não teria sucesso.

Confira os canais para comunicar incidentes:

- CSIRT: csirt@csirt.globo
- Globo Service: globoservice.globo.com
- Telefones: 3911 ou 0800 728 4855

Você precisa participar mais das ações de segurança da informação. Visite o site seguranca.g.globo, assista aos nossos webinars na plataforma Academias Globo, participe de palestras e interaja com as nossas campanhas. Você é fundamental para a segurança da informação. Contamos com você!

<img width="1554" height="1600" alt="unnamed" src="https://github.com/user-attachments/assets/d1d14110-947a-4bb9-9c43-e5900feffcc7" />

# [Blue Team] DevSecOps - Secure Development
<img src="https://user-images.githubusercontent.com/61624336/202805098-ef1b270d-bd2c-4571-b12d-e34b454c46b6.jpg" height="177" align="right">

<!-- ![cópia de 2022-09-06_201515](https://user-images.githubusercontent.com/61624336/201491932-dff8acd0-f8a2-48c9-9370-c2c54636ebb9.png) -->

O **desenvolvimento seguro**, também conhecido como "Desenvolvimento Seguro de Software" ou "DevSecOps," é uma abordagem de desenvolvimento de software que coloca um foco proativo na segurança desde as fases iniciais do ciclo de vida de desenvolvimento de software, portanto, com essa disciplina lidamos diretamente com processos de desenvolvimento seguro. O objetivo do desenvolvimento seguro é identificar e mitigar riscos de segurança em um aplicativo ou sistema desde o início, em vez de abordar a segurança como uma preocupação secundária ou posterior.

Principais aspectos e práticas do desenvolvimento seguro incluem:

1. **Avaliação de Riscos**: Os desenvolvedores e equipes de segurança trabalham juntos para identificar potenciais vulnerabilidades e riscos de segurança no início do processo de desenvolvimento. Isso envolve a realização de avaliações de riscos e análises de ameaças.

2. **Padrões de Codificação Segura**: O desenvolvimento seguro promove o uso de padrões de codificação segura. Isso inclui a escrita de código que evita vulnerabilidades comuns, como injeção de SQL, cross-site scripting (XSS) e outros problemas de segurança.

3. **Testes de Segurança Contínuos**: As equipes realizam testes de segurança regulares ao longo do ciclo de vida do desenvolvimento para identificar e corrigir vulnerabilidades à medida que são descobertas.

4. **Autenticação e Autorização Fortes**: A autenticação e autorização robustas são fundamentais para garantir que apenas usuários autorizados tenham acesso a recursos específicos.

5. **Gerenciamento de Identidade e Acesso (IAM)**: Implementar um sistema eficaz de IAM ajuda a controlar e monitorar o acesso dos usuários aos sistemas e dados.

6. **Monitoramento de Segurança em Tempo Real**: Implementar ferramentas de monitoramento de segurança que possam detectar atividades suspeitas ou invasões em tempo real.

7. **Atualizações e Correções Regulares**: Manter o software e os sistemas atualizados com patches de segurança é essencial para proteger contra ameaças conhecidas.

8. **Treinamento de Conscientização em Segurança**: Treinar desenvolvedores e funcionários em boas práticas de segurança e conscientização sobre ameaças ajuda a fortalecer as defesas. Nesse passo, são implementados variáveis de ambiente (.ENV - Environment Variables) para guardar os segredos de senhas, tokens, IDs, portas, endereços e portas de uma rede.

9. **Integração Contínua e Entrega Contínua (CI/CD)**: Integrar segurança nos processos de CI/CD ajuda a garantir que novas versões de software sejam submetidas a verificações de segurança antes da implantação.

10. **Colaboração entre Equipes**: O desenvolvimento seguro promove a colaboração entre equipes de desenvolvimento, operações e segurança (DevSecOps) para garantir que as considerações de segurança sejam abordadas em todos os estágios.

Desenvolver com segurança é fundamental em um mundo cada vez mais digital, onde ameaças cibernéticas são uma preocupação constante. Ao priorizar a segurança desde o início do ciclo de desenvolvimento, as organizações podem reduzir o risco de violações de dados, garantir a conformidade com regulamentações de privacidade e manter a confiança dos usuários.

# [Blue Team] AS - Application Security
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/cc93af61-7945-4b60-aeb9-3bdcec9bdcaa" align="right" height="77">

A **segurança de aplicação** também conhecida como **segurança de software e sistemas** é uma disciplina fundamental na área de Segurança da Informação que se concentra na proteção de sistemas de computador, redes, aplicativos e dados contra ameaças, ataques e violações de segurança. Ela visa garantir que os sistemas de software sejam resistentes a ataques maliciosos e mantenham a integridade, confidencialidade e disponibilidade dos dados e recursos.

Aqui estão os principais aspectos e objetivos da Segurança de Software e Sistemas:

- **Confidencialidade**: Garantir que apenas usuários autorizados tenham acesso aos dados confidenciais e informações sensíveis. Isso é frequentemente alcançado por meio de mecanismos de autenticação e autorização.

- **Integridade**: Certificar-se de que os dados e os sistemas não foram modificados de maneira não autorizada. Isso envolve a detecção de alterações não autorizadas e a implementação de mecanismos para proteger a integridade dos dados.

- **Disponibilidade**: Assegurar que os sistemas e dados estejam disponíveis quando necessário, minimizando interrupções de serviço devido a falhas ou ataques. Isso pode envolver a redundância de sistemas e a recuperação de desastres.

- **Autenticação**: Verificar a identidade de usuários, dispositivos ou sistemas que tentam acessar um sistema ou recurso. A autenticação pode ser baseada em senha, certificado digital, biometria, entre outros métodos.

- **Autorização**: Gerenciar permissões de acesso, determinando o que os usuários ou sistemas podem fazer após a autenticação. Isso envolve a definição de políticas de controle de acesso.

- **Criptografia**: Proteger dados em trânsito e em repouso por meio da criptografia. Isso torna os dados ilegíveis para terceiros não autorizados, a menos que possuam a chave de descriptografia.

- **Prevenção de Ameaças**: Implementar medidas de segurança para prevenir ameaças, como malware, vírus, phishing, engenharia social e ataques de força bruta.

- **Detecção e Resposta a Incidentes**: Estabelecer sistemas e processos para detectar atividades suspeitas ou violações de segurança e responder a esses incidentes de maneira adequada.

- **Testes de Segurança (Penetração e Avaliação)**: Realizar testes de segurança regulares para identificar vulnerabilidades e fraquezas nos sistemas e aplicativos, além de corrigi-los.

- **Gerenciamento de Identidade e Acesso (IAM)**: Gerenciar a identidade dos usuários, seu registro, suas permissões e o ciclo de vida de contas para garantir que apenas usuários autorizados tenham acesso.

- **Políticas de Segurança**: Desenvolver políticas e procedimentos de segurança para orientar os usuários e administradores sobre as melhores práticas de segurança.

- **Educação e Conscientização em Segurança**: Educar os usuários e a equipe de TI sobre práticas seguras e conscientizá-los sobre ameaças de segurança.

- **Conformidade com Regulamentos**: Garantir que os sistemas e dados estejam em conformidade com regulamentos e leis de proteção de dados, como o GDPR (Regulamento Geral de Proteção de Dados) e HIPAA (Lei de Portabilidade e Responsabilidade do Seguro de Saúde).

- **Desenvolvimento Seguro de Software**: Integrar práticas de segurança desde o início do ciclo de vida do desenvolvimento de software, conhecido como DevSecOps.

A Segurança de Software e Sistemas (Aplicação/Produto) é uma área em constante evolução devido à crescente sofisticação das ameaças cibernéticas. Garantir a segurança dos sistemas é fundamental para proteger a confidencialidade, integridade e disponibilidade dos dados e recursos, bem como para manter a confiança dos usuários e clientes.

Portanto, a autenticação e a autorização são dois conceitos fundamentais em segurança de software e sistemas. Eles desempenham papéis distintos e essenciais na garantia da integridade e segurança dos sistemas para proteger sistemas e dados. 

A **autenticação** é o processo de verificar a identidade de um usuário, sistema ou entidade. Geralmente, isso envolve a verificação de credenciais, como nomes de usuário e senhas, certificados digitais, impressões digitais, cartões inteligentes ou outros métodos de autenticação. O objetivo da autenticação é garantir que o acesso a um sistema ou recurso seja concedido apenas a entidades legítimas.

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/463ae696-2e06-4c91-a417-aeb10a5d9f02" align="right" height="477">

- **Password**: 

- **Cookie**:

- **OTP - One-Time Passowords**:

- **Tokens**: Tokens são frequentemente usados em contextos de autenticação e autorização, como tokens de autenticação e tokens de acesso. Eles são pequenos pedaços de dados que representam a identidade ou as permissões de um usuário. Tokens são usados para controlar o acesso a recursos e serviços. Eles são relevantes para a Segurança da Informação, mas também estão relacionados à Engenharia de Software, Redes de Computadores e outros campos.

- **JWT - JSON Web Tokens**: JWT é um formato de token seguro que é comumente usado para autenticação e troca de informações entre partes em um formato JSON. Embora seja fundamental para a autenticação e a autorização seguras, é mais uma tecnologia utilizada para implementar esses conceitos do que uma disciplina em si. JWTs são usados para transmitir informações de identidade e autorização em aplicativos da web e serviços.

- **SSO - Single Sign-On**: O SSO é um conceito e uma tecnologia que permite aos usuários autenticar-se uma vez em um sistema e, em seguida, acessar vários sistemas ou aplicativos sem a necessidade de autenticação separada. Embora aprimore a usabilidade e a segurança, o SSO é frequentemente discutido em contextos de Segurança da Informação, pois envolve o controle de acesso a sistemas interconectados.

- **Sessions**: Sessions são frequentemente usadas para manter o estado de autenticação dos usuários em aplicativos da web. Um identificador de sessão é gerado após a autenticação bem-sucedida e é armazenado no lado do servidor. Isso permite que os usuários acessem recursos protegidos durante a sessão ativa.

- **OpenID Connect**: É um protocolo de identidade construído sobre o OAuth 2.0 que permite a autenticação de usuários e o compartilhamento de informações de identidade entre serviços.

- **SAML - Security Assertion Markup Language**: SAML é um protocolo de SSO baseado em XML que permite a troca segura de informações de autenticação e autorização entre sistemas.

- **X.509**: Um padrão para certificados digitais que é usado em autenticação baseada em certificados e criptografia.

A **autorização** é o processo de determinar que ações um usuário autenticado tem permissão para realizar dentro de um sistema ou aplicativo depois de ter sido autenticado com sucesso. A autorização lida com a concessão de permissões com base na identidade do usuário, nas funções ou nos privilégios atribuídos a essa identidade. Em outras palavras, a autorização determina o que um usuário pode fazer após a autenticação. A autorização envolve a criação de políticas de controle de acesso que especificam quais recursos, funcionalidades ou dados um usuário ou sistema pode acessar e quais ações podem ser executadas.

**Exemplo**: Depois de fazer login em um sistema de gerenciamento de arquivos, você pode ser autorizado a visualizar, editar ou excluir determinados arquivos com base em suas permissões atribuídas.

- **Tokens**: Tokens são frequentemente usados em contextos de autenticação e autorização, como tokens de autenticação e tokens de acesso. Eles são pequenos pedaços de dados que representam a identidade ou as permissões de um usuário. Tokens são usados para controlar o acesso a recursos e serviços. Eles são relevantes para a Segurança da Informação, mas também estão relacionados à Engenharia de Software, Redes de Computadores e outros campos.

- **OAuth - Open Authorization**: OAuth é um protocolo de autorização amplamente usado em aplicativos da web e serviços para permitir que terceiros acessem recursos em nome de um usuário. Embora seja uma parte significativa da segurança e autorização em aplicativos modernos, OAuth também está relacionado à Segurança da Informação, mas transcende essa disciplina.

- **SAML - Security Assertion Markup Language**: SAML é um protocolo de SSO baseado em XML que permite a troca segura de informações de autenticação e autorização entre sistemas.

## [AS] Passwords
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/8942ce77-55d8-4afb-a7e7-354692cc8831" align="right" height="77">

A primeira camada de proteção da sua identidade digital é a sua **senha**. Uma senha é uma sequência de caracteres, como letras, números, símbolos e espaços, usada para autenticação e controle de acesso a sistemas de computador, aplicativos, dispositivos eletrônicos, contas online e outros recursos protegidos por segurança. O objetivo principal de uma senha é verificar a identidade do usuário e garantir que apenas as pessoas autorizadas tenham acesso a determinados recursos ou informações. Ela é pessoal e nunca deve ser compartilhada ou anotada em papéis, Post-its, planilhas etc.

As senhas são uma parte fundamental da segurança cibernética e da proteção de informações pessoais e confidenciais. Elas devem ser mantidas em segredo e escolhidas de forma a serem difíceis de adivinhar para terceiros. Além disso, as boas práticas de segurança recomendam que as senhas sejam complexas, combinando letras maiúsculas e minúsculas, números e caracteres especiais.

A autenticação por senha é um dos métodos mais comuns, onde os usuários fornecem um nome de usuário e senha para verificar sua identidade. No entanto, a autenticação por senha pode ser vulnerável a ataques de força bruta e requer boas práticas de segurança, como senhas fortes, armazenamento seguro das senhas, avisos e tentativas estimadas para logar, CAPTCHA de confirmação, verificação e confirmação de senha, ocultação dos caracteres ao escrever a senha no campo do formulário, e validação dos dados no campo de senha do formulário.

Com o avanço da tecnologia, a autenticação de dois fatores (2FA) e autenticação multifatorial (MFA) tornaram-se métodos de segurança adicionais que complementam o uso de senhas, tornando o acesso a contas e sistemas ainda mais seguro. Isso geralmente envolve a utilização de um segundo método de autenticação, como um código enviado para um dispositivo móvel, um token de segurança ou uma impressão digital, juntamente com a senha, para confirmar a identidade do usuário.

É importante lembrar que a segurança de suas senhas é crucial, e é aconselhável usar senhas únicas para diferentes contas e atualizá-las regularmente para reduzir o risco de comprometimento de segurança.

Existem várias formas de decifrar uma senha, portanto, quanto mais forte ela for, mais protegido(a) você fica. A seguir, veja algumas dicas do que você deve ou não fazer para criar uma senha segura.

**Senha correta**:
- 10 caracteres ou mais
- Números
- Letras maiúsculas e minúsculas
- Símbolos (*&#$%@.)

**Senha incorreta**:
- Sequências numéricas (123456) ou do teclado (qwerty).
- Telefones, termos existentes em dicionários ou palavras fáceis de serem adivinhadas (Globo, nome de familiares, times de futebol, data de aniversário, etc.)
- Senhas repetidas.
- Uso da senha corporativa em cadastros particulares.
- Reutilizar senhas de outras plataformas ou serviços particulares.

Você suspeita que sua senha foi descoberta por alguém? Fale imediatamente com a Segurança da Informação e efetue a troca da senha. Em senha.seguranca.g.globo, você troca a sua senha e testar a força dela em tempo real.

Confira abaixo um exemplo. Para deixar a senha mais forte, você pode criar uma frase, juntar parte das palavras e trocar as letras por números e símbolos:

**senhas fortes**:

```sh
sK%Se-#asFo]te[
sK%.S(Ç9@e-#a2sF5_te[,ç
```

Para testar se a senha é forte, recomendo o site: https://www.security.org/how-secure-is-my-password/

Você sabia que também pode usar um gerenciador para criar senhas únicas e complexas, além de guardá-las? Na Globo, temos o **GSenha**. Para conhecê-lo, acesse seguranca.g.globo.

- Caso tenha dificuldade de criar, bem como memorizar senhas fortes e diferentes para cada serviço, o gerenciador de senhas é o recurso adequado para você.
- Evite criar variações da mesma senha e nunca anote ou armazene suas senhas em locais não seguros, como planilhas, bloco de notas e Post-it.
- Bloquear o computador toda vez que você sair da mesa é uma medida simples que ajuda a manter as suas informações em sigilo, evitando que outras pessoas se passem por você.

## [AS] Cookie
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/bfd9d5d8-4d7d-403d-a73f-4f8ada29c64c" align="right" height="77">

Um **cookie**, no contexto da tecnologia da informação e da internet, é um pequeno arquivo de texto que é armazenado no computador ou dispositivo do usuário quando ele visita um site. Esses arquivos são usados para diversas finalidades, incluindo o armazenamento de informações temporárias ou permanentes relacionadas à interação do usuário com um site específico. Os cookies desempenham um papel importante na experiência de navegação na web e em várias funcionalidades online.

O cookie é armazenado no lado do cliente, ou seja, no dispositivo do usuário, como um navegador da web. Quando você visita um site que utiliza cookies, esses pequenos arquivos de texto são enviados pelo servidor do site e armazenados no seu dispositivo. Os cookies são armazenados no disco rígido ou na memória temporária do seu dispositivo, permitindo que as informações sejam recuperadas e reenviadas para o servidor quando você visita novamente o mesmo site ou páginas relacionadas.

Então, no contexto da internet, um cookie é um mecanismo tecnológico usado para várias finalidades, como rastreamento, personalização e armazenamento de informações temporárias ou permanentes relacionadas à interação do usuário com um site específico. Abaixo, estão algumas das principais funções dos cookies:

- Rastreamento de sessão: Os cookies de sessão são temporários e são usados para rastrear a atividade do usuário durante uma visita específica a um site. Eles geralmente são excluídos assim que o usuário fecha o navegador.

- Rastreamento persistente: Os cookies persistentes são armazenados no dispositivo do usuário por um período específico ou até que o usuário os exclua manualmente. Eles podem ser usados para lembrar informações, como preferências de idioma ou informações de login, em visitas futuras.

- Rastreamento de terceiros: Muitos sites usam cookies de terceiros para coletar dados sobre o comportamento do usuário na web, o que é frequentemente usado para fins de publicidade direcionada. Esses cookies são configurados por terceiros, como redes de anúncios, e podem rastrear a atividade do usuário em diferentes sites.

- Personalização: Os cookies podem ser usados para personalizar a experiência do usuário em um site, oferecendo conteúdo relevante com base em seu histórico de navegação anterior e preferências.

- Autenticação: Cookies também são comumente usados para autenticar usuários em sites, permitindo que eles acessem áreas restritas ou realizem ações específicas após fazer login.

- Análise: Os cookies podem ser usados para coletar dados de análise, permitindo que os proprietários de sites compreendam como os usuários interagem com seu conteúdo e melhorem a usabilidade.

É importante observar que o uso de cookies também levanta questões de privacidade, já que eles podem ser usados para rastrear a atividade do usuário online. Por esse motivo, muitos sites e regulamentações de privacidade exigem que os usuários sejam informados sobre o uso de cookies e deem seu consentimento antes que os cookies sejam armazenados em seus dispositivos.

> **Atenção**: A maneira de excluir cookies do seu navegador pode variar dependendo do navegador que você está usando, pois diferentes navegadores têm interfaces e configurações ligeiramente diferentes. 

A história dos cookies da internet reflete a evolução da tecnologia e as preocupações crescentes com a privacidade do usuário na era digital. A regulamentação e a conscientização sobre a privacidade desempenham um papel fundamental na forma como os cookies são usados e gerenciados atualmente na web.

Na década de 1990, os cookies da internet foram introduzidos nos primeiros dias da World Wide Web. Eles foram desenvolvidos como uma maneira de manter informações do usuário, como preferências e autenticação, enquanto navegavam em diferentes páginas de um site. Os cookies da internet, como conceito, foram desenvolvidos por um engenheiro de software chamado Lou Montulli que trabalhava para a Netscape Communications Corporation, uma empresa de tecnologia que desempenhou um papel fundamental nos primeiros dias da World Wide Web.

Em 1994, Lou Montulli criou os cookies como uma solução técnica para resolver o problema de como manter informações do usuário entre as páginas da web sem a necessidade de armazenar todas essas informações no servidor. Os cookies eram uma forma de armazenar pequenas quantidades de dados no navegador do usuário, que poderiam ser recuperados e enviados de volta ao servidor durante as visitas subsequentes ao site. Isso permitiu que os sites mantivessem informações como preferências de idioma, autenticação de usuário e outros dados relacionados à experiência do usuário.

Assim, Lou Montulli desempenhou um papel crucial na criação dos cookies como uma tecnologia, e eles foram posteriormente padronizados como parte do protocolo HTTP, conhecido com a especificação HTTP Cookies, definida em documentos conhecidos como RFCs (Request for Comments) e adotada como parte do protocolo. Os cookies se tornaram uma parte fundamental da infraestrutura da web e são amplamente utilizados em todo o mundo para uma variedade de finalidades, embora com considerações significativas de privacidade que evoluíram ao longo do tempo.

Com o tempo, os cookies se tornaram amplamente adotados por sites e desenvolvedores para uma variedade de finalidades. Isso inclui manter os usuários conectados, rastrear o comportamento do usuário para análise, personalizar a experiência do usuário e rastrear preferências. E à medida que o uso de cookies se expandiu, surgiram preocupações com a privacidade. Alguns sites e anunciantes passaram a usar cookies para rastrear o comportamento do usuário sem seu consentimento, o que levou a discussões sobre regulamentações de privacidade e à implementação de políticas de consentimento.

Para proteger a privacidade dos usuários, várias regulamentações, como o Regulamento Geral de Proteção de Dados (RGPD) da União Europeia, foram implementadas para exigir que os sites informem os usuários sobre o uso de cookies e obtenham seu consentimento antes de armazená-los em seus dispositivos.

À medida que a tecnologia avança, os métodos de rastreamento e armazenamento de dados evoluem. Novas técnicas, como armazenamento local de navegador e armazenamento de dados em servidor, também foram desenvolvidas para lidar com as limitações e preocupações dos cookies tradicionais.

## [AS] Sessions
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/a0710844-e606-4600-b55a-de402242b1b4" align="right" height="177">

Uma **sessão** (session) é um pequeno arquivo, provavelmente no formato JSON, que armazena informações sobre o usuário, como um ID exclusivo, hora de login e expirações, e assim por diante. Ele é gerado e armazenado no servidor para que o servidor possa acompanhar as solicitações do usuário. O usuário recebe alguns desses detalhes, especialmente o ID, como cookies que serão enviados a cada nova solicitação, para que o servidor possa reconhecer o ID e autorizar as solicitações do usuário.

As Sessions são frequentemente usadas para manter o estado de autenticação dos usuários em aplicativos da web. Um identificador de sessão é gerado após a autenticação bem-sucedida e é armazenado no lado do servidor. Isso permite que os usuários acessem recursos protegidos durante a sessão ativa.

Esse processo é feito da seguinte forma:

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/f4504cb9-e4f8-4568-a4cd-528a94489db6" align="right" height="177">

1. O usuário envia uma solicitação de login para o servidor.
2. O servidor autentica a solicitação de logon, envia uma sessão para o banco de dados e retorna um cookie contendo a ID da sessão para o usuário.
3. Agora, o usuário envia novas solicitações (com um cookie).
4. O servidor verifica no banco de dados o ID encontrado no cookie, se o ID for encontrado, ele envia as páginas solicitadas para o usuário.

Como as sessões são armazenadas no servidor, seus administradores têm poder sobre elas. Por exemplo, se uma equipe de segurança suspeitar que uma conta está comprometida, ela poderá invalidar imediatamente a ID da sessão, para que o usuário seja imediatamente desconectado. Por outro lado, como uma sessão é armazenada no servidor, o servidor é responsável por procurar o ID da sessão que o usuário envia. Isso pode causar problemas de escalabilidade.

As sessões e autorizações são conceitos intimamente relacionados e, às vezes, sobrepostos na especificação do TPM 2.0, mas não são termos sinônimos. As sessões são o veículo para autorizações, mas também são usadas para outros fins que não a autorização, em conjunto com as autorizações ou completamente independentes delas. Por exemplo, as sessões usadas para autorização também podem ser usadas para especificar modificadores por comando, como criptografar, descriptografar e auditar. As sessões também podem ser usadas para esses modificadores por comando sem serem usadas simultaneamente para quaisquer autorizações.

Os cookies podem ser expostos a ataques de falsificação de solicitações entre sites. O invasor pode enganar o usuário para um site hostil, onde alguns scripts JS podem explorar cookies para enviar solicitações maliciosas ao servidor. Outra vulnerabilidade diz respeito às chances de um ataque man-in-the-middle, em que um invasor pode interceptar o ID da sessão e executar solicitações prejudiciais ao servidor.

## [AS] SSO - Single Sign-On
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/a1509ae8-6b7f-4ff8-902c-1b118435ffcb" align="right" height="77">

O **SSO - Single Sign-On**, é uma forma de autenticação que permite o acesso a diferentes aplicativos e plataformas utilizando um só cadastro. Em tradução livre para o português, seu nome significa "Acesso único", e resume a proposta. É uma medida muito utilizada em meios digitais e que agiliza processos para a experiência do usuário.

Um dos principais exemplos de uso do Single Sign-On é o Google. Ao fazer o login com sua conta, é possível usufruir de todos os serviços da empresa com o mesmo cadastro. Por isso, a conta no YouTube é a mesma do Gmail, do Google Drive e outras funcionalidades.

A ideia do Single Sign-On é simples: interligar diversos sites e serviços com uma só forma de cadastro. O login é feito em uma plataforma que se conecta com os outros sites e aplicativos, fornecendo os cookies de autorização. A cada acesso em um site, esses cookies são validados e o acesso é liberado sem a necessidade de outra tentativa de login. Dessa forma, o SSO requer apenas uma única autenticação. O acesso só é exigido novamente ao limpar os cookies, trocar o navegador ou usar um dispositivo diferente.

Ao acessar a conta do Google, por exemplo, o usuário é redirecionado para uma página de endereço "https://accounts.google.com/". O Google Accounts é o serviço utilizado pela empresa para realizar o Single Sign-On, validando o acesso em todas as suas plataformas.

O uso do SSO torna-se cada vez mais comum no dia-a-dia. A Apple, por exemplo, utiliza o ID Apple para acessar iCloud, iTunes e outros demais serviços da empresa. A Amazon também possui o "Login with Amazon", que permite o acesso ao site da empresa, Prime Video, Amazon e sites de terceiros.

Outro caso recorrente de SSO envolve os cadastros utilizando redes sociais. Já tentou se cadastrar em uma plataforma que ofereceu a possibilidade de registro usando o Facebook? Essa também é uma forma de validação por SSO, já que o acesso a esse site será validado enquanto as credenciais da rede social estiverem ativas no navegador.

## [AS] OTP - One-Time Passwords
A **One Time Password** é um código alfanumérico aleatório que só pode ser usado uma vez para validar o acesso em uma plataforma. Em tradução livre, a OTP pode ser interpretada como “senha de uso único”: esses códigos são gerados aleatoriamente pela respectiva plataforma de login ou por aplicativos de autenticação e enviados ao usuário por e-mail ou celular.

## [AS] Token
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/c5691b4f-ccf4-43ec-be3e-17efb38312d7" align="right" height="77">

Um **token** é um termo genérico que se refere a um pequeno pedaço de dados que é usado para representar a autenticação, autorização ou outros tipos de informações em sistemas de computador. Tokens são amplamente utilizados em diversas áreas da tecnologia, incluindo segurança da informação, autenticação de usuários, redes, criptomoedas e muito mais. 

O termo "token" tem origens linguísticas e conceituais que remontam muito antes da tecnologia digital moderna. O uso da palavra "token" para representar um objeto, símbolo ou marcador que representa um valor ou autorização é algo que existe há séculos. A inspiração para o uso desse termo na tecnologia digital, como na representação de autenticação e autorização, pode ser entendida a partir dessa história. No mundo físico, onde "tokens" têm sido usados como moedas ou fichas iguais aquelas de Poker de Casinos para representar valor ou autorização. Esses tokens podem ser trocados por mercadorias ou serviços. A ideia de um objeto que representa algo de valor é uma origem conceitual para o uso do termo em sistemas digitais. Em linguística, um "token" pode ser uma unidade de linguagem, como uma palavra ou um símbolo, que representa um conceito ou significado específico. Isso reflete a ideia de que um token em sistemas digitais representa informações ou autorização específicas.

> Trata-se de um dispositivo, físico ou digital, que é muito utilizado em logins de plataformas online e empresas bancárias. Ele é um código numérico instantâneo, que protege contra fraudes e aumenta a segurança. Essas são as características do token na área de tecnologia.

A localização dos tokens, no lado do cliente ou do servidor, pode variar dependendo do contexto e do tipo de token em questão. Um exemplo de tokens de autenticação no lado do cliente são em sistemas de autenticação baseados em tokens, como JSON Web Tokens (JWTs), os tokens são gerados no lado do servidor e enviados para o cliente. O cliente, que geralmente é um navegador da web ou um aplicativo móvel, armazena o token. O token é então incluído nas solicitações para autenticar o usuário ao servidor. O servidor verifica e valida o token para autorizar o acesso.

Já os tokens de sessão no lado do servidor são em sistemas de gerenciamento de sessão, os tokens de sessão são normalmente gerados e armazenados no lado do servidor. Quando um usuário se autentica, o servidor cria um token de sessão único, armazena-o no servidor e fornece um identificador (geralmente um cookie ou um ID de sessão) ao cliente. O cliente envia esse identificador em todas as solicitações subsequentes. O servidor, com base no identificador, recupera o token de sessão correspondente do seu armazenamento e valida o usuário.

Ademais, os tokens de autenticação em sistemas de terceiros, onde os sistemas de autenticação de terceiros, como o OAuth, os tokens de acesso podem ser gerados no lado do servidor de autorização (terceiros) e enviados ao cliente. O cliente usa o token de acesso para acessar recursos protegidos no servidor de recursos (outro sistema). No entanto, o token em si não é armazenado pelo cliente, mas sim usado em solicitações para acessar recursos específicos.

E, por fim, os tokens de segurança em redes de computadores, como sistemas de autenticação de dois fatores (2FA), tokens de segurança são geralmente dispositivos de hardware ou aplicativos móveis que geram códigos temporários. Esses tokens estão no lado do cliente, pois são usados pelo usuário para autenticar-se.

No início, a autenticação costumava depender exclusivamente de senhas e códigos PIN (Personal Identification Numbers) para verificar a identidade dos usuários. No entanto, senhas e PINs eram vulneráveis a várias formas de ataques, incluindo força bruta e adivinhação. A solução para melhorar a segurança da autenticação foi a introdução de **tokens de hardware**. Os primeiros tokens de hardware eram dispositivos que geravam códigos temporários, conhecidos como "códigos de tempo" (time-based codes), que o usuário inseria junto com sua senha para autenticação. Esses tokens eram conhecidos como "tokens OTP" (One-Time Password).

Aqui estão algumas das principais formas em que tokens são utilizados:

- Autenticação de Usuário: Os tokens são frequentemente usados em sistemas de autenticação. Um exemplo comum é o token de sessão, que é gerado quando um usuário faz login em um site ou aplicativo e é usado para verificar a identidade do usuário em solicitações subsequentes.

- Autorização: Tokens também podem ser usados para autorização. Um exemplo é o "token de acesso" em sistemas OAuth, que é usado para conceder permissões de acesso a recursos protegidos, como contas de mídia social.

- Criptomoedas: Em criptomoedas como o Bitcoin e Ethereum, os tokens são unidades digitais de valor que podem ser usadas para representar ativos ou contratos inteligentes. Exemplos incluem o Bitcoin (BTC) e o Ether (ETH).

- Segurança da Informação: Tokens são usados em segurança da informação para criar códigos únicos e efêmeros que são difíceis de replicar. Por exemplo, tokens de segurança gerados por aplicativos de autenticação de dois fatores (2FA).

- Redes de Computadores: Em redes, tokens podem ser usados para controlar o acesso a um meio de transmissão compartilhado, como o acesso a um canal de comunicação ou a concessão de direitos de transmissão em uma rede de anel.

- Autenticação de API: Ao usar APIs (interfaces de programação de aplicativos), tokens de API são frequentemente usados para autenticar solicitações feitas por aplicativos ou serviços a servidores de back-end.

- Tokenização de Dados: Na segurança de pagamentos e na conformidade com o PCI DSS, os tokens são usados para substituir informações confidenciais, como números de cartão de crédito, por um token que pode ser usado para referenciar os dados reais sem armazenar informações sensíveis.

- Blockchain: Tokens são frequentemente criados em plataformas de blockchain, como Ethereum, para representar ativos digitais, como tokens de utilidade em projetos de blockchain ou fichas de segurança em ofertas iniciais de moedas (ICOs).

Os tokens podem ser uma parte fundamental da segurança e da tecnologia de sistemas de informação, uma vez que fornecem um meio eficaz de gerenciar autenticação, autorização e outras informações sensíveis. A forma e o propósito específico de um token dependem do contexto em que é usado. 

É importante entender que os tokens geralmente são gerados, gerenciados e verificados por meio de algoritmos específicos, que podem variar dependendo do tipo de token e de seu propósito. Vou fornecer uma visão geral dos algoritmos e técnicas comumente usados para criar e verificar tokens em diferentes contextos:

Algoritmos de Geração de Token:

- HMAC (Hash-based Message Authentication Code): Usado para gerar tokens de autenticação seguros, como tokens de sessão e tokens de acesso. Combina uma chave secreta com os dados a serem autenticados, gerando um código de autenticação.

- Algoritmos de Criptografia Assimétrica: Chaves pública e privada são usadas para gerar e verificar tokens em sistemas de autenticação e autorização.

- Algoritmos de Hashing: Como SHA-256, SHA-512, MD5, usados para criar hashes de dados ou mensagens que podem ser usados como tokens ou códigos de verificação.

Algoritmos de Verificação de Token:

- Algoritmos de Verificação de Assinatura: Usados para verificar a autenticidade de tokens assinados digitalmente. Algoritmos incluem RSA, ECDSA, entre outros.

- Comparação de Token: Em sistemas de autenticação de dois fatores, a verificação do token é uma simples comparação com o token gerado pelo usuário.

- Algoritmos de Descriptografia: Em alguns sistemas, tokens podem ser criptografados e, para verificá-los, é necessária a descriptografia usando uma chave.

Algoritmos de Tokenização:

- Algoritmos de Tokenização de Pagamentos: Em sistemas de pagamento, algoritmos são usados para transformar informações confidenciais, como números de cartão de crédito, em tokens seguros.

- Algoritmos de Tokenização de Dados: Usados para substituir dados sensíveis em documentos ou bancos de dados por tokens que não revelam as informações reais.

- Algoritmos de Geração de Códigos Efêmeros: Em sistemas de autenticação de dois fatores, algoritmos como o TOTP (Time-Based One-Time Password) e HOTP (HMAC-based One-Time Password) são usados para gerar códigos de autenticação efêmeros.

- Algoritmos de Criação de Tokens Blockchain: Em plataformas de blockchain, são usados algoritmos específicos para criar e gerenciar tokens digitais, como ERC-20 (Ethereum) e BEP-20 (Binance Smart Chain).

- Algoritmos de Geração de Tokens de Jogo: Em jogos eletrônicos, são usados algoritmos específicos para a criação e gerenciamento de moeda virtual e ativos do jogo.

Lembre-se de que a escolha do algoritmo ou técnica apropriada depende do contexto e do tipo de token a ser usado. Além disso, a segurança é fundamental na geração e na verificação de tokens, especialmente em sistemas que tratam informações sensíveis ou confidenciais. Portanto, é importante utilizar algoritmos e práticas de segurança adequadas ao seu cenário específico.

## [AS] Bearer
O **Bearer authentication** traduzido para o português como autenticação ao portador (também conhecido como token authentication) é um Schema para autenticação HTTP (RC6750) que envolve tokens de segurança chamados tokens de portador, comumente chamado de **Bearer** cujo é um tipo de token de acesso usado em protocolos de autenticação, como o OAuth 2.0 e o OpenID Connect, para conceder acesso a recursos protegidos. O nome "Autenticação ao portador" pode ser entendido como "dar acesso ao portador deste token". Os tokens Bearer são uma forma simples de autenticação, onde o token em si é considerado prova de que o solicitante (cliente) tem permissão para acessar os recursos protegidos. O termo "Bearer" se refere ao fato de que qualquer pessoa que possua o token pode usá-lo para acessar os recursos, da mesma forma que alguém que possui uma chave de porta (bearer key) pode abrir a porta correspondente.

O token de portador é uma cadeia de caracteres enigmática, geralmente gerada pelo servidor em resposta a uma solicitação de login. O cliente deve enviar esse token no cabeçalho ao fazer solicitações para recursos protegidos: O esquema de autenticação do portador foi originalmente criado como parte do OAuth 2.0 na RFC 6750, mas às vezes também é usado por conta própria. Da mesma forma que a autenticação Básica, a autenticação ao Portador só deve ser usada por HTTPS (SSL) Authorization.

```xml
Authorization: Bearer <token>
```

O Bearer identifica recursos protegidos por um OAuth2. O `<token>` deve ser um string. Ele representa uma autorização do Server emitida para o client. Por sua vez, o client deve possuir mecanismos próprios para identificar e validar o Token.

## [AS] JWT - JSON Web Token
<img src="https://cdn.worldvectorlogo.com/logos/jwt-3.svg" height="77" align="right">

O **JWT (JSON Web Token)** é um padrão aberto RFC-7519 que é uma técnica que é padrão com a função de autenticação entre duas partes, por meio de um token assinado, praticamente, define uma maneira compacta e autônoma de representar informações entre duas partes de uma forma que pode ser verificada e confiável, por meio de um token assinado. Ele é uma forma de autenticação que permite que um servidor verifique a identidade de um usuário sem precisar armazenar informações sobre ele. Ele transmite e armazena de forma segura os objetos JSON entre diferentes aplicações. O JWT é assinado usando uma chave secreta com algoritmo HMAC ou um par de chaves públicas e privadas RSA ou ECDSA. 

Imagine que você comprou a entrada para um evento e recebeu uma pulseira, essa pulseira contém informações importantes como o tipo de acesso que você tem como um ingresso VIP, data de validade e informações pessoais como o seu nome, quando você chega em um evento e apresenta uma pulseira os seguranças vão checar a validade da pulseira.

O token JWT surgiu como um padrão da Internet para a criação de dados com assinatura opcional e/ou criptografia, definido pela RFC-7519. Ele tem como base outros padrões baseados em JSON, como o **JSON Web Signature** e o **JSON Web Encryption**. Além disso, é vantajoso por ser compacto, seguro para URL e fácil de usar, especialmente em um contexto de login único no navegador da web. O JSON Web Token faz parte de uma família de especificações conhecida como JOSE (JSON Object Signing and Encryption), em português significa Assinatura e criptografia de objetos JSON. 

O JWT (JSON Web Token) é um formato de token que é gerado e assinado no lado do servidor e, em seguida, enviado para o lado do cliente. Embora seja transmitido ao cliente, ele é projetado para ser uma estrutura segura de dados que contém informações sobre o usuário ou entidade autenticada, portanto, o JWT é uma abordagem eficaz para autenticação e autorização em sistemas distribuídos, pois permite que as informações sejam transmitidas de forma segura entre diferentes partes e pode ser usado em diferentes tecnologias e linguagens de programação. No entanto, é importante proteger a chave secreta usada para assinar os tokens, uma vez que qualquer pessoa que tenha acesso a ela pode gerar tokens válidos.

O JWT e OAuth2 são as soluções mais implementadas para autenticação e autorização de Api's, portanto, o JWT é frequentemente usado para autenticação e autorização em sistemas web e serviços, especialmente em APIs RESTful possibilitando criar serviços verdadeiramente RESTful. O JWT oferece uma maneira estruturada e stateless de guardar informações de autorização de um usuário, permitindo também que a aplicação client guarde as permissões do usuário, podem ser encriptados e cryptographically signed para evitar adulterações e podem escalar horizontalmente. Possuem expiração interna e são independentes. O JWT token tem várias vantagens, mas uma das principais é aumentar a segurança da troca de informações ou acesso que algum usuário possa ter.

Quando um usuário faz login com sucesso, um JWT é gerado e fornecido como parte da resposta. O token é então incluído nas solicitações subsequentes para autenticar o usuário. O servidor verifica a autenticidade do JWT através da verificação da assinatura e usa as informações da carga útil para determinar as permissões e direitos do usuário.

Ele é regido por um conjunto bem definido de instruções tanto para a emissão quanto para validação. O token possui as claims que serão usadas por um client para limitar o acesso do usuário.

Um JWT é uma sequência de caracteres codificados em JSON que consiste em três partes separadas por pontos (`.`), geralmente na forma `xxx.yyy.zzz`, representando os seguintes componentes:

1. **Cabeçalho** (`Header`): O cabeçalho contém informações sobre o tipo de token e o **algoritmo de assinatura** usado. Ele é tipicamente um objeto JSON com dois campos, "`typ`" (tipo) e "`alg`" (algoritmo), como este:

```json
{
  "typ": "JWT",
  "alg": "HS256"
}
```

O Header é um JSON que possui informações sobre o tipo de token e o algoritmo de criptografia utilizado. 

2. **Carga Útil** (`Payload`): A carga útil contém as informações que são transportadas pelo token, como identificação do usuário, reivindicações de autorização e outros dados relevantes. Ela pode ser personalizada para atender às necessidades da aplicação. Exemplo:

```json
{
  "sub": "1234567890",
  "name": "John Doe",
  "iat": 1516239022
}
```

Também é um objeto JSON, mas que contém as Claims (Reivindicações) do usuário. Elas são classificadas em três tipos: 

   - **Reserved claims**: Atributos reservados pela JWT, recomendados, que são utilizados na validação do Token. As mais comuns são `iss` (issuer), `exp` (expiration time), `sub` (subject), `aud` (audience). Para consultar todos, acesse rfc7519 - Section 4.1

   - **Public claims**: Informações que serão utilizados na aplicação para autorizar os recursos que o usuário tem acesso.

   - **Private claims**: Usadas para compartilhar informações entre aplicações.

3. **Assinatura** (`Signature`): A assinatura é gerada pela combinação do cabeçalho, da carga útil e de uma chave secreta usando o algoritmo especificado no cabeçalho. Ela é usada para verificar a autenticidade do token. A assinatura é uma sequência de caracteres que garante que o token não foi adulterado durante a transmissão. A parte da assinatura pode ser calculada da seguinte forma:

```sh
HMACSHA256(base64UrlEncode(header) + "." + base64UrlEncode(payload), secret)
```

Para criar a assinatura precisa codificar o Header e o Payload em base64, uma senha e utilizar o algoritmo de criptografia especificado no Header, após isso deverá assinar com a chave de criptografia. Dessa forma, previne ataques do tipo man-in-the-middle, garantindo que as informações dentro do token são confiáveis.

Com isso, um JWT possui o seguinte aspecto:

```js
eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkJydW5vIiwiaWF0IjoxNTE2MjM5MDIyfQ.YDN0wJHLzyzmqdwycv4wghRMBwQR4C_0uehWmo_77ZrAB46YnPYmzJJ2Lb36GyyDXDwRP9Bt759hcVmUiGWEg
```

Há três seções nesta string, separado por ponto: Header, Payload e Signature.

## [AS] OIDC - OpenID Connect
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/4c420263-e657-4d3a-b763-989911842e79" align="right" height="77">

O **OpenID Connect** ou OIDC é um protocolo de identidade que utiliza os mecanismos de autorização e autenticação do OAuth 2.0. A especificação final do OIDC foi publicada em 26 de fevereiro de 2014 e agora é amplamente adotada por muitos provedores de serviços de identificação na Internet.

O OIDC foi desenvolvido pela OpenID Foundation, que inclui empresas como Google e Microsoft. Enquanto o OAuth 2.0 é um protocolo de autorização, o OIDC é um protocolo de autenticação de identidade e pode ser usado para verificar a identidade de um usuário para um serviço cliente, também chamada Parte Confiável. Além disso, as claims dos usuários, como, por exemplo, nome, endereço de e-mail, etc., também podem ser compartilhadas mediante solicitação.

Uma ampla variedade de clientes pode usar o OpenID Connect (OIDC) para identificar usuários, de aplicativos de página única (SPA) a aplicativos nativos e móveis. Também pode ser usado para login único (SSO) em todos os aplicativos. O OIDC usa JSON Web Tokens (JWT) e fluxos HTTP e evita o compartilhamento de credenciais do usuário com serviços.

O OpenID Connect tem consentimento integrado. Isso é importante, pois o OIDC é usado com frequência em serviços voltados para o consumidor (por exemplo, uma Parte Confiável), onde o compartilhamento de dados pessoais requer o consentimento explícito do usuário.

Esses recursos, juntamente com a simplicidade de implementação, tornam o OpenID Connect um protocolo útil quando a identidade de um usuário é necessária, e uma alternativa poderosa ao SAML 2.0 mais complexo. Também é especialmente adequado para aplicativos móveis.

O OIDC utiliza o OAuth 2.0 como um protocolo subjacente. As principais extensões são um valor de escopo especial ("openid"), o uso de um token extra (o token de ID, que encapsula as claims de identidade no formato JSON) e a ênfase na autenticação em vez da autorização. Além disso, no OIDC, o termo "fluxo" é usado no lugar da "concessão" do OAuth2.

O provedor de OIDC (geralmente chamado de provedor de OpenID ou provedor de identidade ou IdP) realiza autenticação do usuário, consentimento do usuário e emissão de token. O cliente ou serviço que solicita a identidade de um usuário é normalmente chamado de Parte Confiável (RP). Pode ser, por exemplo, um aplicativo da web, mas também um aplicativo JavaScript ou um aplicativo móvel. \ nConstruído sobre o OAuth 2.0, o OpenID Connect usa tokens para fornecer uma camada de identidade simples integrada à estrutura de autorização subjacente. Esta integração implica o uso dos seguintes tipos de token:

- Token de ID: Específico para OIDC, o uso principal deste token no formato JWT é fornecer informações sobre o resultado da operação de autenticação. Mediante solicitação, pode fornecer os dados de identidade que descrevem um perfil de usuário. Os dados sobre o resultado da autenticação e as informações do perfil do usuário são chamados de claims. As claims do perfil do usuário podem ser quaisquer dados que sejam pertinentes à Parte Confiável para fins de identificação, como uma ID persistente, endereço de e-mail, nome, etc.

- Token de acesso: Definido no OAuth2, este token de vida curta (opcional) fornece acesso a recursos específicos do usuário, conforme definido nos valores do escopo na solicitação ao servidor de autorização.

- Token de atualização: Vindo das especificações do OAuth2, esse token geralmente tem vida longa e pode ser usado para obter novos tokens de acesso.

Os tokens de ID devem ser assinados digitalmente para evitar adulterações. Eles também podem ser criptografados para fornecer privacidade adicional, embora, em muitos casos, a segurança da camada de transporte (HTTPS) seja suficiente. Para SPAs e aplicativos móveis, a criptografia de token de ID não é útil, pois a chave de descriptografia pode ser descoberta facilmente.

A escolha do fluxo do OpenID Connect depende do tipo de aplicativo e de seus requisitos de segurança. Existem três fluxos comuns:

- **Fluxo implícito**: Neste fluxo, comumente usado por SPAs, os tokens são devolvidos diretamente para a RP em um URI de redirecionamento.

- **Fluxo de código de autorização**: Este fluxo é mais seguro do que o fluxo implícito, pois os tokens não são retornados diretamente. Para aplicativos nativos/móveis e SPAs, a segurança pode ser aprimorada usando uma chave de prova para troca de código.

- **Fluxo híbrido**: Combinando os fluxos de código implícitos e de autorização, neste caso o token de ID é devolvido diretamente para a RP, mas o token de acesso não. Em vez disso, é retornado um código de autorização que é trocado por um token de acesso.

## [AS] OAuth2.0 - Open Authorization 2.0
<img src="https://upload.wikimedia.org/wikipedia/commons/d/d2/Oauth_logo.svg" align="right" height="77">

O **OAuth** (Open Authorization) é um protocolo de autorização amplamente utilizado na internet para permitir que aplicativos de terceiros acessem recursos de um usuário (como informações em uma conta de rede social, serviços de e-mail, armazenamento em nuvem, etc.), sem a necessidade de compartilhar senhas. O OAuth é projetado para fornecer segurança e controle ao usuário sobre os dados a que um aplicativo pode acessar, sem que o usuário precise fornecer suas credenciais de login ao aplicativo de terceiros.

> O OAuth 2.0 é um protocolo padrão para autorização. Permite que aplicativos como Web App, Mobile e Desktop obtenham acesso limitado às informações de usuários através do protocolo HTTP. Também é um framework de segurança (Autenticaçao e Autorização), pense num livro de regras. Ele descreve como usuários que através de clients terão acessos aos recursos protegidos pela aplicação.

Então, OAuth (Open-Authorization) é um padrão aberto de delegação de autorização, comumente utilizado para permitir que os usuários da Internet possam fazer logon em sites de terceiros usando contas de um provedor de identidade, como Google, Facebook, Microsoft, Twitter, etc. Mas, sem expor credenciais de autenticação, como senhas. Geralmente, o OAuth fornece aos clientes um "acesso seguro delegado" aos recursos do servidor em nome do proprietário do recurso. Ele especifica um processo para proprietários de recursos para autorizar o acesso de terceiros aos seus recursos de servidor sem compartilhar suas credenciais. Projetado especificamente para trabalhar com o protocolo HTTP, o OAuth permite essencialmente tokens de acesso a ser emitidos para clientes de terceiros, mediante autorização do servidor, com a aprovação do proprietário do recurso. O terceiro, em seguida, usa o token de acesso para recursos protegidos hospedados pelo servidor.

O OAuth surgiu em Novembro de 2006, quando Blaine Cook trabalhava na implementação de segurança para o Twitter. Juntamente com outros desenvolvedores, Cook percebeu que não havia um padrão aberto para a delegação de acesso à APIs. Um grupo de discussão foi criado para o planejamento de um protocolo aberto. E Recebeu interesse do Google. Em 4 de Dezembro de 2007, OAuth 1.0 foi lançado [RFC 5849]. Em Outubro de 2012, OAuth 2.0 foi publicado [RFC 6749].

OAuth 2.0 não é compatível com o OAuth 1.0. OAuth 2.0 fornece fluxos de autorização específicos para aplicações web, aplicações desktop, celulares e dispositivos de sala de estar. A especificação e RFCs associados são desenvolvidos pelo IETF OAuth WG; o principal framework foi publicado em outubro de 2012.

A Graph API do Facebook suporta apenas OAuth 2.0. O Google oferece suporte OAuth 2.0 como o mecanismo de autenticação recomendado para todas as suas APIs. A partir de 2011, a Microsoft adicionou experimentalmente o suporte ao OAuth 2.0 para as suas APIs.

O OAuth 2.0 Framework e o Bearer Token foram publicados em outubro de 2012.

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/f2ae9579-7b2a-47ce-bb57-66a36d92a62b" align="right" height="277">

O OAuth é um serviço complementar e diferente do OpenID. OAuth é também distinto do OATH que é uma arquitetura de referência para autenticação, e não uma norma para autorização. No entanto, o OAuth está diretamente relacionada com o OpenID Connect (OIDC) pois OIDC é uma camada de autenticação construída em cima do OAuth 2.0. OAuth é também distinto do XACML, que é a política de autorização padrão. OAuth pode ser usado em conjunto com XACML onde OAuth é utilizado para a transferência de propriedade de consentimento e de acesso delegação considerando que XACML é usado para definir as diretivas de autorização (por exemplo, os gestores podem visualizar os documentos em sua região).

Portanto, o OAuth 2 é um framework de segurança. Descreve como permitir o acesso, limitado, aos dados dos usuários em um client, através do protocolo HTTP. Ele delega a autenticação a um server que hospeda a conta do usuário. E especifica como compartilhar as informações de autorização a outros aplicativos. Ele é composto por: Users (Usuários), Roles (Papéis), Clients (Clientes) e Resources (Recursos).

O OAuth 2.0 define quatro roles (papéis):

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/b9adb59d-a647-4b5a-b8c8-c2201c0e3299" align="right" height="377">

- **Resource Owner**: É a pessoa (entidade) que concede o acesso aos seus dados. Literalmente o Dono do Recurso. É como o OAuth 2.0 classifica o usuário.

- **Resource Server**: É a API. Exposta na internet e contém os dados do Usuário. Para conseguir acesso ao seu conteúdo é necessário um token emitido pelo Authorization Server.

- **Authorization Server**: Responsável por autenticação e emitir tokens de acesso (Access Token). Detém informações dos Resource Owner (Usuários) e expõe no formato de Claims através do Bearer Token. Autentica e interage com o usuário após identificar e autorizar o client. É o Single Sign On (SSO) em sí. Centraliza as credenciais de acesso dos usuários. Faz a autenticação do usuário. Responsáver também por:

   - Identificar e autenticar Resource Server, Clients e Usuários.
   - Gerenciar as claims dos usuários
   - Emitir Access Token
   - Federation Gateway
   - Autenticação como serviço

- **Client**: É a aplicação que interage com o Resource Owner. No caso de uma App Web, seria a aplicação do Browser.

Explicando o fluxo de uma maneira prática:

<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/9573ad63-69cb-4990-81ba-be221d7a2fa9" align="right" height="177">

1. (A) O Usuário acessa um client. Para ter acesso ao conteúdo protegido da api (Resource Server) o client (A) Solicita Autorização(implicity) ao Resource Owner.

2. (B) A Autorização é Concedida pelo usuário (Resource Owner) ao, por exemplo, clicar no botão `Login`.

3. (C) O client solicita um token de acesso ao Authorization Server através da autenticação de sua própria identidade.

![image](https://github.com/IsaacAlves7/DevSecOps/assets/61624336/fbf010df-67e9-4c7c-9e24-2799a21834c5)

4. (D) O Usuário (Resource Owner) confirma sua identidade através do seu usuário e senha ou através de um terceiro (Facebook, Google). Se tudo ocorrer bem um Access Token será criado e devolvido para o client gerenciar.

5. (E) Por fim o client informa o Access Token ao Resorce Server.

6. (F) O Resource Server faz validação e retorna o Conteúdo Protegido.

O fluxo pode diferenciar, dependendo da configuração da aplicação, como por exemplo no **Password flow**, onde o cliente não é redirecionado para o Authorization Server.

Password Flow, também conhecido como Resource Owner Password Credentials (ROPC) Flow, é um dos fluxos de autenticação definidos no OAuth 2.0, um protocolo amplamente utilizado para autenticação e autorização em aplicativos e serviços na web. O Password Flow permite que um aplicativo cliente obtenha um token de acesso em troca das credenciais de nome de usuário e senha do usuário final. Embora seja um fluxo disponível no OAuth 2.0, ele é considerado menos seguro do que outros fluxos, como o fluxo de autorização implícita ou o fluxo de código de autorização.

## [AS] auth0
<img src="https://github.com/IsaacAlves7/DevSecOps/assets/61624336/e5801525-9d35-4f90-8105-0e7d2656dcf7" align="right" height="77">

O **Auth0** é uma plataforma de identidade que permite a autenticação e autorização de usuários em aplicativos da web, móveis e legados. Com algumas poucas linhas de código, você pode integrar a Auth0 a qualquer aplicação, usando qualquer linguagem e estrutura. A plataforma oferece mais de 30 SDKs e Inícios rápidos para ajudar você a ter sucesso na sua implementação 123.

O auth0 é uma plataforma de autenticação como serviço (AaS - Authentication-as-Service) usada para gerenciar a porta de entrada do seu aplicativo. Ele fornece soluções de autenticação de usuário que ficam ótimas em qualquer aplicativo front-end e se integram a qualquer servidor back-end. 

## [AS] Engenharia Reversa
O "Blue Team" é a equipe de segurança responsável por defender um sistema ou rede. Eles se concentram em manter a segurança, identificar vulnerabilidades e responder a ameaças. A engenharia reversa pode ser usada pelo "Blue Team" para entender como malware funciona, analisar vulnerabilidades em software e hardware e melhorar as defesas.

- `.docm`
- `.hta`
- `.jar` - Esse arquivo da linguagem Java pode editar qualquer parte do sistema via JRE.
- `.bat`
- `.vbs` - sigla para Visual Basic Script (script para Visual Basic), é uma linguagem que acessa elementos de ambientes que utilizam a linguagem.
- `.dll`
- `.tmp`
- `.com`
- `.msi`
- `.msp`
- `.cmd` - Esse tipo de arquivo pode editar qualquer parte do sistema via prompt de comando.
- `.jse`
- `.vbe`
- `.ps1`
- `.lnk`
- `.inf`
- `.scf`
- `.gadget`
- `.py`
- `.sfx`
- `.pdff`
- `.tro`
- `.djvus`
- `.darus`
- `.stare`
- `.format`

Os tipos de ameaças Cibernéticas:

- Vírus (Malwares):

- Trojans:

- Worms:

- Ransomwares:

- Spywares:

- Adwares:

- Bots:

- Keyloggers:

- Exploits: Um "exploit" é um programa, código, técnica ou conjunto de instruções que aproveita uma vulnerabilidade de segurança em um sistema, aplicativo ou dispositivo para executar ações não autorizadas ou maliciosas. Os exploits são frequentemente usados por hackers e invasores cibernéticos para explorar essas vulnerabilidades e ganhar acesso não autorizado a sistemas ou aplicativos.

## [IS] SF - Single Factor

## [IS] 2FA - Factor

## [IS] MFA - Multifactor Authenticator
O **MFA**, ou "Autenticação Multifatorial" (em inglês, Multi-Factor Authentication), é um método de segurança que exige que os usuários forneçam duas ou mais formas diferentes de verificação de identidade antes de serem autorizados a acessar uma conta, sistema ou aplicativo. Em vez de depender apenas de uma senha, a MFA adiciona camadas adicionais de segurança para proteger o acesso a informações sensíveis.

Por isso, utilizamos uma camada extra de segurança: o MFA. Veja como ele funciona:

- Algo que você sabe: a sua senha, por exemplo.
- Algo que você tem: o token de um aplicativo, por exemplo.
- Algo que você é: a sua impressão digital ou o reconhecimento facial, por exemplo.

Sabe quando os bancos pedem que você confirme algumas transações utilizando um código numérico? Isso é um token, uma forma de MFA!

O MFA é mais uma camada de proteção adicionada à sua identidade digital. Caso alguém descubra sua senha, o MFA ajudará a impedir que alguém se passe por você. 

> **Lembre-se**: a senha e o MFA são de uso exclusivo, portanto, não os compartilhe com ninguém.

# ❤️ Red Team
<img src="https://user-images.githubusercontent.com/61624336/201538678-23db4481-44ce-4c83-957f-2d73b8094ffa.png" height="77" align="right">

O **Red team** (equipe vermelha), que tem como foco os **ataques**, ou seja, é uma equipe que trabalha na área de Segurança Ofensiva com o objetivo de validação de segurança das aplicações, infraestrutura, serviços e sistemas através de testes de invasão, ou Pentest (Penetration Test). Ou seja, simulam os ataques e operações hacker (envolvendo phishing, OSINT, pentest, entre outros). Este time conhece as principais ameaças existentes e faz a simulação dos ataques da forma mais realista possível, depois disso recomendam formas de melhorar a segurança dos sistemas, processos e pessoas. O Red team atua na defesa ofensiva, buscando vulnerabilidades potenciais e a forma de remediá-las. Também conhecem as práticas de Engenharia social e Engenharia reversa, que é usada para acesso a dados pessoais e informações bancárias das pessoas, por meio de ameaça e senso de urgência e são pesquisadores de segurança, ou seja, são especialistas em analisar a habilidade atual da empresa defender seus bens de diferentes tipos de ataques.

O **Pentest** (teste de penetração) é uma atividade com foco em encontrar problemas de segurança em um determinado alvo, e é uma forma de conferir a segurança tentando penetrar nos sistemas da organização, descobrir de que forma a organização está vulnerável e quais as formas de ataque e como a defesa ocorreria durante o ataque. A pessoa que lida com as vulnerabilidades de um sistema e explora ela para reportar para o time de desenvolvimento de uma aplicação, é chamado de **Pentester**. Ele pode reportar erros, bugs e o código com uma lógica de programação ruim para o desenvolvedor responsável, a fim de alerta-lo sobre possíveis ataques de pessoas mal-intencionadas no sistema. Você vai aprender a identificar vulnerabilidades e fazer testes de validação de segurança, tendo o ponto de vista de fora da aplicação, ou seja, do lado do(a) atacante. E, para isso, você irá conhecer ferramentas do Kali Linux para fazer os testes de invasão na prática.

A **Engenharia social** é um termo utilizado para descrever um método de ataque em que alguém faz uso da persuasão para conseguir informações ou acessos não autorizados. Já a **Engenharia reversa** é o processo de analisar um objeto, sistema, software ou tecnologia existente a fim de compreender seu funcionamento interno, design e funcionalidades. Esse processo envolve desmontar, descompilar ou de outra forma examinar o objeto de estudo com o objetivo de obter insights sobre como ele foi criado, sem acesso à documentação original ou ao conhecimento prévio do projeto. A engenharia reversa é frequentemente usada em várias áreas, incluindo engenharia de software, eletrônica, engenharia de hardware e segurança da informação. A engenharia reversa é uma atividade que pode ser praticada por ambas as equipes de segurança, o "Blue Team" e o "Red Team", mas geralmente é mais associada ao "Red Team".

As fases de um Hacker ético incluem:

<img src="https://www.svgrepo.com/show/111972/white-homburg-hat.svg" height="77" align="right">

1. **Reconhecimento**: Coletar o máximo de informações o possível, para isso ele faz o uso de ferramentas como: **HTTrack** e **Maltego**;

2. **Varredura**: Encontrar maneiras fáceis e rápidas de acessar a rede e procurar informações (Escaneamento de portas TCP e UDP do sistema e as vulnerabilidades do sistema), para isso ele faz o uso de ferramentas como: **Nmap** e **OpenVas**;

3. **Obter acesso**: Quem invade usa todos os meios para obter acesso não-autorizado aos sistemas, aplicativos ou redes do alvo. Podemos utilizar ferramentas para isso, a mais comum é a **Metasploit**;

4. **Manter acesso**: Quem invade tenta seu melhor para manter esse acesso e explora continuamente o sistema. Para isso utilizam as práticas de **back door** que melhor traduzindo significa "porta dos fundos" que funciona como um escape para toda a parte de criptografia do sistema e fazer um ataque com **Trojan** (Cavalo de Troia) que é um Malware que cria dentro do sistema mais uma porta de invasão;

5. **Limpeza**: O invasor limpa o seu rastro a fim de não ser pego. Assim, essa etapa garante que os invasores não deixem pistas ou evidências que possam ser rastreadas.

Para isso, esses profissionais utilizam essas ferramentas em sistemas operacionais próprios para desempenhar melhores resultados! Podemos citar alguns abaixo:

<img src="https://user-images.githubusercontent.com/61624336/192110734-3651dfcc-9ccc-4f3a-a40c-5c196fa7e913.svg" align="right" height="77">

- BlackArch, baseado no Arch Linux;
- BackBox, baseado no Ubuntu;
- WHAX, baseado no Slackware;
- Pentoo, baseado no Gentoo; 
- **Kali Linux**, baseado no Debian.

As certificações para Hackers Éticos:

- <a href="https://www.eccouncil.org/programs/certified-ethical-hacker-ceh/">Certified Ethical Hacker - CEH</a>
- <a href="https://www.comptia.org/certifications">CompTIA</a>

Tipos de ataques/golpes cibernéticos:

- **Spoofing**: O ataque de Spoofing é uma técnica usada em segurança cibernética na qual um atacante falsifica informações, como endereços de IP, endereços de e-mail, identidades ou outros atributos, para mascarar sua identidade e enganar as vítimas ou sistemas de segurança. O termo "spoofing" deriva da palavra "spoof," que significa falsificação ou imitação. Os ataques de spoofing podem ser usados em várias formas e contextos para realizar ações maliciosas. Então, a técnica é usada por hackers para se passar por outra pessoa ou uma empresa legítima e roubar dados por meio da engenharia social e persuasão, abaixo estão alguns exemplos de ataques de spoofing:

  - **Boleto falso**: Você recebe um boleto com todos os seus dados, porém quando você paga o dinheiro vai para outra conta e a sua conta não é afetada, somente o dinheiro foi desviado do que parecia ser um contrato bancário para a conta do golpista. Os golpistas geram chaves de pagamento e códigos de barras parecendo ser o máximo possível com o boleto original.
 
  - **via SMS (atualizações fraudulentas)**: Você recebe uma mensagem muito verdadeira sobre você e te pedem para realizar os passos ou autorização do seu sistema e através disso o criminoso começa a acessar o seu celular e tem acesso total, como entrar dentro de sua conta bancária e tirar dinheiro.

  - **Perfil falso**: Utilizar fotos para enganar pessoas em redes sociais e cria todo um cenário pra interagir com alvo para depois capturar informações ou compras no nome da pessoa.

  - **Investimento e Marketing multinível**: Golpe de pirâmide financeira com contratos fraudulentos, e com propostas de ganhar acima do mercado e quando você vai ver, seu dinheiro evaporou.

  - **Golpe de emprego**: Os bandidos entram em contato com pessoa propondo emprego, fazem acordos e depois cobram uma taxa e depois engana a pessoa. O emprego na verdade é falso e os bandidos se passam por RH no processo seletivo.

  - **Golpe telefônico (planos de internet/conta bancária)**: O golpista utiliza de números aleatórios (spoofing) para fazer chamadas no telefone da vítima propondo ofertas de planos da operadora ou conta bancária, mas é tudo mentira, ele só quer confirmar os dados e pegar dados do cartão de crédito da vítima. 

  - **Golpe do suporte técnico**: Um falso suporte técnico realiza engenharia social com a vítima, onde fala que tem um chamado ou operação no dispositivo da rede ou aparelho eletrônico da vítima, e ela cai no golpe.

  - **Golpe do WhatsApp**: Você recebe mensagens e solicitações de pessoas se passando por outras pessoas afim de espionar você ou seus contatos para aplicar golpes financeiros ou chantagem.

  - **Golpes vias páginas falsas**: O golpista usa domínios e sites muito parecidos com os sites autênticos na internet para enganar suas vítimas, através de links e telas parecidas. Mas na verdade é tudo só uma forma dele capturar os dados da vítima ou instalar um vírus em sua máquina.

  - **Golpe do FGTS**: O golpe do FGTS pelo WhatsApp é uma prática ilegal e criminosa na qual os golpistas enganam as vítimas com o envio de mensagens fraudulentas com a intenção de obter informações pessoais e bancárias ou até mesmo fazê-las realizar depósitos de dinheiro em contas de terceiros.

- **DDoS**: DDoS, ou Distributed Denial of Service (Negação Distribuída de Serviço), é um tipo de ataque cibernético em que um grande número de dispositivos ou computadores, muitas vezes distribuídos geograficamente, é coordenado para inundar um alvo com tráfego de rede de alta intensidade. O objetivo principal de um ataque DDoS é sobrecarregar os recursos de um sistema, rede ou serviço, tornando-o inacessível para os usuários legítimos. Esses ataques são uma ameaça significativa à disponibilidade de serviços online e podem ter sérias consequências, especialmente para empresas e organizações que dependem da disponibilidade contínua de seus sistemas.

- **DoS**: DoS, ou Denial of Service (Negação de Serviço), é um tipo de ataque cibernético em que um atacante procura tornar um serviço, sistema ou rede indisponível para seus usuários legítimos, impedindo o acesso a recursos ou interrompendo a operação normal. Diferentemente dos ataques DDoS (Distributed Denial of Service), em que múltiplos dispositivos são coordenados para realizar o ataque, em um ataque DoS, um único dispositivo ou ponto de origem é usado para sobrecarregar o alvo. Os ataques DoS podem variar em termos de complexidade e método, mas todos têm o objetivo comum de negar o acesso ou a utilização de um serviço.

- **Brute Force Password Authentication**: Brute Force Password Authentication, em tradução livre "Autenticação por Força Bruta de Senhas", é um método de ataque cibernético no qual um atacante tenta obter acesso a uma conta protegida por senha testando repetidamente todas as combinações possíveis de senhas até encontrar a senha correta. Esse tipo de ataque é relativamente simples em sua abordagem, mas pode ser eficaz se a senha alvo for fraca ou previsível.

- **Phishing**: Phishing é uma técnica de ataque cibernético em que um atacante tenta enganar os usuários, geralmente por meio de e-mails falsos, mensagens de texto, sites fraudulentos, propagandas enganosas (Ads) ou outros meios de comunicação eletrônica, para que revelem informações confidenciais, como senhas, números de cartão de crédito, informações de login ou detalhes pessoais. O termo "phishing" é uma combinação das palavras "password" (senha) e "fishing" (pesca), sugerindo a ideia de "pescar" informações confidenciais dos usuários.

- **Sniffing**: Ataques de sniffing envolvem a captura não autorizada de tráfego de rede para interceptar informações, como senhas ou dados confidenciais.

- **Man-in-the-Middle (MitM)**: Em ataques MitM, um atacante intercepta a comunicação entre duas partes legítimas, permitindo a manipulação ou a captura de informações.

- **Ataques de aplicativos Web**: Isso inclui a exploração de vulnerabilidades em aplicativos da web, como Cross-Site Scripting (XSS) e Cross-Site Request Forgery (CSRF).

- **Ataques a Aplicativos Móveis**: Ataques a aplicativos móveis exploram vulnerabilidades em aplicativos para dispositivos móveis, muitas vezes visando informações pessoais ou acesso não autorizado.

- **Ataques a DNS**: Isso inclui ataques de envenenamento de cache DNS, que redirecionam o tráfego para sites maliciosos.

- **Ataques de Escala Horizontal**: Os atacantes podem usar containers comprometidos como base para lançar ataques de escalada horizontal, expandindo sua presença em um ambiente de contêiner.

- **Injeção**: existem diversos tipos de ataques de injeção, os mais comuns são os ataques de injeção de SQL que podem ser usados para explorar vulnerabilidades em aplicativos da web e obter acesso a bancos de dados. Em um cenário de containers, os atacantes podem explorar vulnerabilidades de segurança no código do container para injetar código malicioso ou executar comandos no container e podem criar imagens de container maliciosas ou comprometidas que, quando implantadas, executam código malicioso. 

- **Ataques de Resource Exhaustion**: Atacantes podem criar containers que consomem excessivos recursos de CPU, memória ou armazenamento, causando degradação de desempenho ou indisponibilidade.

- **Ataque de Dicionário**: Atacantes podem usar ataques de força bruta ou de dicionário para tentar adivinhar senhas e credenciais usadas em contêineres.

- **Ataques de Reconhecimento**: Atacantes podem conduzir varreduras de portas ou exploração de vulnerabilidades para identificar contêineres vulneráveis em um cluster.

- **Account Takeover (ATO)**: é um tipo de ataque cibernético no qual um invasor obtém acesso não autorizado a uma conta online pertencente a um usuário ou a uma organização. O objetivo do ataque de ATO é assumir o controle total ou parcial da conta, o que pode permitir ao invasor realizar uma série de atividades maliciosas, como roubar informações, realizar ações fraudulentas, enviar spam ou cometer fraudes.

- **Backdoor**: é uma técnica ou mecanismo oculto que permite o acesso não autorizado a um sistema de computador, aplicação ou rede. É essencialmente uma maneira secreta de contornar os métodos normais de autenticação ou segurança e ganhar acesso privilegiado, muitas vezes sem o conhecimento ou consentimento dos usuários ou administradores legítimos.

- **Clonagem**: o ataque de clonagem, na área de segurança cibernética, refere-se à criação de uma cópia não autorizada de um dispositivo, cartão de acesso, identidade digital ou qualquer outro elemento que possa ser usado para autenticação ou acesso a sistemas, redes ou informações restritas. Essa cópia é criada com o objetivo de enganar sistemas de segurança e obter acesso não autorizado.

- **Adivinhação**: Esse tipo de ataque é através da exploração de resultados de dados da vítima a fim de obter dados pessoais dela como email, senha, fotos e vida pessoal.

Os objetivos desses golpes são:

- Roubar dados
- Chantagens e ameaças
- Roubar recursos financeiros
- Destruir reputação
- Causar danos materiais
- Vandalismo
- Terrorismo
- Criar caos
- Perseguição e cacoação

O que todos esses golpes tem em comum é a exploração da falta de conhecimento da vítima e a sutileza usada em seus ataques que só é perceptivel após a vítima se dar conta dos prejuízos gerados e verificar a causa do ataque.

**Exemplo**: Vamos pensar em um cenário bem comum, um cliente decide comprar um item em uma loja virtual pouco conhecida na internet, e vamos considerar que os proprietários da loja são pessoas de confiança, porém não possuem qualquer noção de segurança em sistemas digitais na internet e o cliente não se preocupou em verificar a segurança dela, e após o cliente efetuar a compra com seu cartão de crédito e inserir dados pessoais. Infelizmente, muitas coisas ruins podem acontecer nesse cenário, pois um invasor experiente pode descubrir vulnerabilidades ou falhas nesse sistema da loja e fazer proveito dessas vulnerabilidades para estorquir informações dos clientes ou aplicar golpes que vai começar a afetar os clientes e os lojistas da loja.

# [Red Team] Engenharia Reversa
O Red Team é a equipe de segurança que atua como adversária e realiza testes de penetração para identificar fraquezas em um sistema. A engenharia reversa é uma técnica comum usada pelo "Red Team" para entender como os atacantes podem explorar vulnerabilidades e criar contramedidas eficazes.

Em resumo, enquanto ambas as equipes podem praticar engenharia reversa, o "Red Team" geralmente a utiliza de forma mais ativa para simular ataques de hackers e ajudar a aprimorar a segurança do sistema, identificando vulnerabilidades e fornecendo recomendações para mitigá-las. O "Blue Team" usa a engenharia reversa de maneira mais defensiva, como parte de sua estratégia para aprimorar as defesas de segurança.

# [Red Team] Spoofing

# [Red Team] Injection
À medida que o mundo digital se torna cada vez mais interligado, a segurança na Web emergiu como uma preocupação crítica tanto para empresas como para indivíduos. E só depois que sua empresa sofre um ataque é que você começa a incorporar segurança em seu fluxo de trabalho e, infelizmente, para muitas organizações, geralmente é isso que pode ser obtido. É melhor adotar uma abordagem defensiva e proativa à segurança na web do que tentar apagar o fogo de um ataque na web que já foi iniciado. Nesta postagem, exploraremos estratégias essenciais para fortalecer sua aplicação web contra ataques comuns. Espero que, ao final deste artigo, você adote uma mentalidade de segurança em seus projetos e seja infundido com uma boa dose de paranóia, especialmente como engenheiro de software.

## [Red Team] Cross-Site Scripting (XSS)
Os ataques XSS envolvem a injeção de scripts maliciosos em páginas da web, que são então executados nos navegadores dos usuários. Simplificando, se você tiver um formulário de registro não higienizado para um blog, um usuário poderá inserir o código javascript nas tags do formulário e, quando esses dados maliciosos forem retornados ao navegador, o navegador poderá executá-los. Pode ser tão simples quanto o código abaixo ou pode ser feito para postar informações de cartão de crédito ao invasor. 

[![HTML5](https://img.shields.io/badge/-index.html-000000?style=social&logo=HTML5&logoColor=orangered)](#)

```javascript
<script type="text/javascript"
  window.onload = function() {alert("Olá, mundo!");};
</script> 
```

**Prevenção**:

- Empregue validação de entrada e codificação de saída: Valide e higienize as entradas do usuário para evitar a execução de scripts maliciosos.
- Implementar Política de Segurança de Conteúdo (CSP): Defina uma política que restrinja a execução de scripts e controle o carregamento de recursos externos, reduzindo o risco de ataques XSS.
- Utilize cabeçalhos de segurança do navegador: defina cabeçalhos de segurança apropriados, como X-XSS-Protection e X-Content-Type-Options, para instruir os navegadores a aplicar medidas de segurança e evitar problemas de interpretação de conteúdo.

## [Red Team] SQL Injection (SQLi)
As ameaças cibernéticas não param de evoluir. As injeções de SQL (SQLi) são um tipo de ataque que usa códigos SQL maliciosos e servem para manipular bancos de dados e acessar informações sensíveis. Os ataques de SQL permitem aos hackers burlar sistemas de autenticação, roubar dados e, pior, garantem acesso root ao sistema. Aqui, vamos falar mais sobre o que são estas injeções, os riscos que elas causam e como se proteger delas da melhor forma possível.

## [Red Team] NoSQL Injection (NoSQLi)
O NoSQL Injection é uma ameaça de segurança que afeta bancos de dados NoSQL, assim como as injeções de SQL afetam bancos de dados SQL. No entanto, as técnicas de injeção variam dependendo do tipo de banco de dados NoSQL que está sendo usado, como MongoDB, Cassandra, CouchDB, entre outros.

A NoSQL Injection ocorre quando um aplicativo web não valida ou filtra adequadamente os dados de entrada fornecidos pelo usuário e permite que um atacante execute comandos não autorizados no banco de dados NoSQL. Esses comandos podem explorar as vulnerabilidades do aplicativo para acessar, modificar ou excluir dados no banco de dados.

# [Red Team] Account Takeover (ATO)
O **Account Takeover (ATO)**, em português, significa "tomada de controle de conta" e refere-se a um tipo de ataque cibernético em que um invasor ganha acesso não autorizado a uma conta online pertencente a um usuário legítimo. Isso pode incluir contas de redes sociais, contas de e-mail, contas bancárias, contas de compras online, entre outras.

Os atacantes empregam várias técnicas para realizar um ATO com sucesso, incluindo:

- Força Bruta: Os invasores tentam várias combinações de nomes de usuário e senhas até encontrarem a combinação correta. Isso é conhecido como ataque de força bruta.

- Reutilização de Credenciais: Os invasores usam credenciais vazadas de violações de dados anteriores, nas quais as pessoas reutilizam senhas em várias contas. Se um serviço online é comprometido e senhas vazam, os invasores tentam usar essas mesmas senhas em outras contas do usuário.

- Phishing: Os atacantes enganam os usuários para que revelem suas credenciais por meio de mensagens de e-mail ou sites falsos que se passam por serviços legítimos.

- Malware: Malware, como keyloggers, pode ser usado para capturar senhas digitadas pelos usuários.

- Engenharia Social: Os invasores podem usar técnicas de engenharia social para obter informações pessoais dos usuários, como respostas a perguntas de segurança.

Uma vez que os invasores obtêm acesso às contas, eles podem realizar uma série de atividades maliciosas, incluindo roubo de informações pessoais, acesso a comunicações, realização de ações em nome do usuário (como postagem de conteúdo não autorizado em redes sociais), roubo de fundos (em contas bancárias ou de comércio eletrônico) e muito mais.

A proteção contra ATO é fundamental e pode envolver a implementação de medidas de segurança, como autenticação de dois fatores (2FA), monitoramento de atividades suspeitas, análise de comportamento do usuário, políticas de senhas fortes e educação dos usuários para evitar práticas inseguras, como a reutilização de senhas. As empresas e prestadores de serviços online também desempenham um papel importante na proteção das contas de seus usuários, implementando medidas de segurança robustas e respondendo prontamente a atividades suspeitas.

# [Red Team] Brute Force

# [Red Team] Phishing
O **Phishing** (derivado da palavra “fishing”, que significa “pescaria”, em inglês) é a tentativa de obter informações por meio de mensagens falsas. Nesse golpe, o(a) atacante tenta se passar por outra pessoa para obter nomes de usuário, senhas, dados e informações.

Mesmo que você quase nunca receba um e-mail como esse, o ponto do exercício é demonstrar que não podemos confiar em uma mensagem apenas por ela parecer vir de alguém que conhecemos. O pedido parece incomum? Antes de clicar em links, abrir anexos ou tomar alguma ação, use um segundo canal para confirmar a solicitação. E lembre-se: o e-mail falso é um incidente. Você deve encaminhar as mensagens suspeitas para a Segurança da Informação.

**Prevenção**:

1. Domínio de e-mail: Confira, com atenção, o e-mail do(a) remetente. Às vezes, atacantes vão mudar apenas uma letra ou trocá-la de lugar só para confundir você. Na dúvida, consulte, por conta própria, outro canal para validação, como a intranet ou um telefone de contato. Encaminhe a mensagem para o time de Resposta a Incidentes de Segurança da Informação (CSIRT) pelo botão `Reportar Phishing` ou `Phish Alert`, no email como o Outlook.

2. Assunto: Cuidado com mensagens urgentes. Atacantes tentam manipular suas emoções usando linguagem ameaçadora, tentadora ou criando um senso de urgência para convencê-lo(a) a divulgar informações confidenciais ou clicar em links.

3. Anexos: Recebeu um anexo que não esperava? Não faça download nem execute arquivos não solicitados.

4. Linguagem e identidade visual: Observe toda a mensagem antes de responder ou clicar em links e anexos, especialmente se o assunto for uma novidade. É desse jeito que a empresa costuma se comunicar? A aplicação da marca está correta? O texto apresenta erros de português? Cada detalhe conta!

5. Links: Sempre passe o mouse sobre o link ou botão no corpo do e-mail para verificar a URL de destino. Na dúvida, não clique. E claro: nunca forneça informações ou credenciais em páginas que você considere suspeitas.

# [Red Team] Backdoor
Uma **backdoor** (porta dos fundos, em português) é uma técnica ou mecanismo oculto que permite o acesso não autorizado a um sistema de computador, aplicação ou rede. É essencialmente uma maneira secreta de contornar os métodos normais de autenticação ou segurança e ganhar acesso privilegiado, muitas vezes sem o conhecimento ou consentimento dos usuários ou administradores legítimos.

As backdoors podem ser implantadas de várias maneiras, e algumas delas incluem:
