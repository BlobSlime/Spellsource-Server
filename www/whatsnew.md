---
layout: page
title: What's New
permalink: /whats-new/
---
Thanks for playing Spellsource today! Release notes are below.

#### 0.7.3-2.0.12 (#2 for Saturday, December 1st, 2018)

Thanks to a contribution from @Jdude, new cards have been added to Spellsource!

###### Content Additions:

 - The Hero card Rafaam, Supreme Thief and its power, I think I will take it!
 - The "Giants" series containing Articus, the Giant; Castle Giant; Crystal Giant; Fiendish Giant; Gentleman's Giant; Holy Giant; Mossy Giant; Reckless Giant; Sand Giant; Ticking Giant; Tree Giant
 - The custom cards A Second Heart; Arcane Construct; Automedic Androne; Death's Messenger; and Golemuxx, Forest Guardian.
 
###### Content Fixes:

 - Wartbringer can now select a target for its damage.
 - Akali the Rhino now buffs the card it draws.

##### 0.7.2-2.0.12 (#1 for Saturday, December 1st, 2018)

Server improvements should lead to even more reliable connections.

**0.7.1-2.0.12** (Friday November 30th, 2018)

Thanks again to a contribution from @doombubbles, the remaining Rastkhan's Rumble cards have been completed.

Immortal Prelate is still under development.

###### Content Additions:

 - All Rastakhan's Rumble cards except Immortal Prelate have been added.

**0.7.0-2.0.12** (Friday, November 30th, 2018)

Server improvements should lead to greater reliability of connections.

In the next release, signing on in a new session will disconnect the previous session. 

###### Usability Fixes:

 - Adding and removing cards from decks works again. 2.0.11 and earlier, like the iOS and Android builds, still have this issue. Your patience for a new build, which requires a review process from Apple, is appreciated.

###### Content Fixes:

 - Rotbutcher Gordo and about a dozen other custom cards are no longer appear incorrectly in the Wild filter in your Collection view.
 - Hopesteed is collectible.

**0.6.6-2.0.11** (Wednesay, November 28th, 2018)

Thanks to a great contribution from @doombubbles, new custom cards and a significant number of Rastakhan's Rumble cards have been added to the game.

###### Content Additions:

 - The custom cards Owlkin Hatchling, Overclock, Bittertide Crab, Bronze Timekeeper, Dr. Doom, Finley the Explorer, Jastor Gallywyx, Miniature Gunner, Southsea Giant, Trophy Huntress, Whizbang the Plunderful, T'Paartos the Lightforged, and the much loathed Hopesteed.
 - 97 Rastakhan's Rumble cards. The remainder will be released soon.
 
###### Content Fixes:

 - King Togwaggle now puts Ransom in the opponent's hand.
 - Elortha no Shanda now does not cause infinite deathrattle loops.
 - Dinosaur Chops is now uncollectible.
 - Thunderfury now is immune and does not reduce durability while you are overloaded.
 - Shudderwock now triggers Hagatha the Witch and other hero battlecries.

**0.6.5-2.0.11** (Tuesday, November 27th, 2018)

Thanks to a great contribution from @tehgdogg, replay functionality has been added for debugging and development purposes. Your games will be recorded and used to fix bugs when they occur. Currently, it is not possible to retrieve a replay from the client. Please reach out on Discord if you want a replay of a specific game.

###### Usability Fixes:

 - The Stats button (the eyeball iconed button in the battlefield) now renders the deck and hand sizes correctly.
 - May have fixed some crashes related to missing null checks on weapon loading.

###### Known Issues:

 - Some situations with drawing cards from the deck can cause the game to hang. If this happens to you, please note what you were doing and report it in the Discord.
 - Repeatedly playing King Togwaggle will cause the game to hang.

For an ongoing list of issues, see https://github.com/hiddenswitch/Spellsource-Server/issues

**0.6.4-2.0.10** (Monday, November 26th, 2018)

Overall server performance has been improved by better using computer resources.

Some connectivity issues ought to be improved. Please report "Networking" errors in the Discord.

###### Content Fixes:

 - Chromie now draws cards instead of moving them directly from the deck. Thus, Chromie's swap counts as a true draw.
 - Lord Stormsong's deathrattle is less buggy.
 - Purrfect Tracker and other filtered deck draw effects interact with "Cast this when drawn" effects should no longer cause crashes.
 - Bright Eyed Scout and other card cost modification effects that occur on draw should no longer cause crashes.
 - Totemic Slam now interacts with Fandral Staghelm, for fun.

**0.6.3-2.0.9** (Saturday, November 24th, 2018):

###### Content Fixes:

 - Reckless Flurry now works. Previously, it did not deduct armor.
 - Giant Barbecue now deals damage to the target of the spell.
 - Crackling Arrows now works when the player has no secrets.
 - Little Helper now interacts with Vashj's Plot correctly.
 - Lady Vashj now puts a Serpent Spine Bow into play.
 - Elaborate Scheme no longer triggers Gloat if Scheme puts Gloat onto the battlefield with Scheme's effect.
 - Ravenous Lasher now triggers.
 - Sorrowstone now triggers when more than three minions die at a time.
 - Conjured Assistance only triggers if it can actually pull anything from your hand.

###### Usability Fixes:

 - Milling and discarding cards now appear in the Power History.
 - Any triggers whose side effects cause a card to be revealed will appear in the power history. For example, Dragonling Pet ("Start of Game: If your deck has no tribal minions except Dragons, draw this card from your deck.") will now appear in the power history at the start of the game.
 - UI elements overlap less.
 - The number of power history elements has been reduced to 8 from 10.
 - Power history from a previous match is no longer present.
 - The Edit button in the Quick Play / Matchmaking views is now a pencil icon button.
 - The enemy hero and minions will correctly get highlighted when you begin a physical attack. Previously, the highlighting only appeared once you hovered over a valid target.
 - The enemy hero can be targeted by battlecries on your second and later matches.