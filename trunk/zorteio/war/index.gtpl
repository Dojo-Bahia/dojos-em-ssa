<h1>Zorteio</h1>

<p>
    Para sortear um número aleatório de 1 até um número máximo, digite na URL:<br/> 
	<strong>http://zorteio.appspot.com/sorteio/&lt;num_max&gt;</strong><br /><br />
	Ex: <a href="/sorteio/20">http://zorteio.appspot.com/sorteio/20</a>
</p>

<p>
    Adicionalmente você pode descrever qual o prêmio sorteado:<br/> 
	<strong>http://zorteio.appspot.com/sorteio/&lt;num_max&gt;?premio=&lt;premio&gt;</strong><br /><br />
	Ex: <a href="/sorteio/30?premio=Uma camisa do LinguÁgil">http://zorteio.appspot.com/sorteio/30?premio=Uma camisa do LinguÁgil</a>
</p>

<p>
    Se quiser, forneca a URL do site que contém a base, sem a última barra.<br/>
    Como último parâmetro da URL deve ser passado o número sorteado.<br/>
	O serviço REST deve retornar uma string no formato <strong>nome,email</strong>.<br/> 
	<strong>http://zorteio.appspot.com/sorteio/&lt;num_max&gt;?premio=&lt;premio&gt;&url=&lt;url_base&gt;</strong><br /><br />
	Ex: <a href="/sorteio/11?premio=Uma camisa do LinguÁgil&url=http://zorteio.appspot.com/user">http://zorteio.appspot.com/sorteio/11?premio=Uma camisa do LinguÁgil&url=http://zorteio.appspot.com/user</a><br/>
	O Zorteio irá exibir nome e e-mail do ganhador e um botão de confirmação, para que seja enviada uma mensagem informativa ao vencedor do sorteio.<br/> 
</p>
<br/>
<br/>
<br/><font size="2"><p align="center">A primeira versão desta aplicação foi produzida numa sessão de Coding-Dojo no Serpro, em 06/05/2011. Saiba mais clicando <a href="http://dojo-bahia.blogspot.com/2011/05/relato-do-dojoserpro-gaelyk.html">aqui</a></p></font>
<center><img src="/images/gaelyk-badge.png">
