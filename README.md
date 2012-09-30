Taki Validator Project
======================
This small project is a Taki card game validator method that will return true if the sequence of cards on specific scenario is legal in TAKI card game.
Check out the rules:  http://www.shafirgames.com/images/instructions/taki_he.pdf

General project tree description
--------------------------------
<pre>
src--
	|--- com.taki.sample.game---
	|						   |-- Card.java	- Card class represents single "card" 		
	|						   |				  entity, described by TYPE of card ,COLOR and LOCATION
	|                          |-- Config.java 	- Config.java maps the available data to be used in Taki Game 
	|                          | 				  Ex. : Card (4,Blue) will be represented as :  
	|						   |                  Card( Config.TYPE.get(3) , Config.COLOR.get(0) )
	|                          |-- Dealer.java -- 
	|											|---Validate()	 - Validate method gets 2 types of parameters,
	|											|				 The mandatory and the optional one.
	|															 When calling Validate, the current Active card
	|											                 in deck must be sent, in addition to the player's
	|						                                     List of Cards. the method will evaluate if the 
	|															 List of cards are valid to put and will reply
	|                                                            with a boolean. Optional parameters are for 
	|															 special states of the game flow, like 'Taki State'
	|															 When you can drop all your unicolor cards altogether
	|--- test.taki.sample.game---																 
								|-- DealerTest.java				 - JUnit 5 test cases ready to run								 
								|
</pre>
How To Use
----------
Check out the test cases to begin with, this will give a general idea of how to call Validate() ,legal parameters, states of game flow and more..