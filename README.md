Taki Validator Project
======================
This small project is a Taki card game validator method that will return true if the sequence of cards on specific scenario is legal in TAKI card game.
Check out the rules:  http://www.shafirgames.com/images/instructions/taki_he.pdf

General project tree description
--------------------------------
src--</br>
....|--- com.taki.sample.game---</br>
....|..........................|-- Card.java....-.Card class represents single "card" 		</br>
....|..........................|..................entity, described by TYPE of card ,COLOR and LOCATION</br>
....|..........................|-- Config.java..-.Config.java maps the available data to be used in Taki Game </br>
....|..........................|..................Ex. : Card (4,Blue) will be represented as :  </br>
....|..........................|..................Card( Config.TYPE.get(3) , Config.COLOR.get(0) )</br>
....|..........................|-- Dealer.java -- </br>
....|...........................................|---Validate()...- Validate method gets 2 types of parameters,</br>
....|...........................................|................The mandatory and the optional one.</br>
....|............................................................When calling Validate, the current Active card</br>
....|............................................................in deck must be sent, in addition to the player's</br>
....|............................................................List of Cards. the method will evaluate if the </br>
....|............................................................List of cards are valid to put and will reply</br>
....|............................................................with a boolean. Optional parameters are for </br>
....|............................................................special states of the game flow, like 'Taki State'</br>
....|............................................................When you can drop all your unicolor cards altogether</br>
....|--- test.taki.sample.game---																 </br>
................................|-- DealerTest.java..............- JUnit 5 test cases ready to run		</br>						 
................................|</br>
</br>
How To Use
----------
Check out the test cases to begin with, this will give a general idea of how to call Validate() ,legal parameters, states of game flow and more..