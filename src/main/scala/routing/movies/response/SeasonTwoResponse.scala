package com.paranid5.twin_peaks_tv_server
package routing.movies.response

import routing.movies.entity.{Actor, Episode, Season}

import cats.effect.IO
import io.circe.syntax.*
import org.http4s.Response
import org.http4s.circe.CirceEntityCodec.circeEntityEncoder
import org.http4s.dsl.io.*

def seasonTwo: IO[Response[IO]] =
  Ok:
    Season(
      title = "Season 2",
      year = 1991,
      rating = 8.1,
      description = "The second season of 'Twin Peaks' continues to unravel the mysteries that were introduced in the first season, while also introducing new storylines and characters. The characters continue to investigate the mysteries surrounding Laura, encountering new events and intrigue along the way.\n\nThroughout the second season, a number of new mysteries are unveiled, including threats from the past, dark family secrets, intrigue within the city's administration and underworld, and mystical phenomena that remain unsolved. Despite the resolution of some mysteries, many remain unanswered at the end of the season.",
      thumbnailUrls = List(
        s"$imageHostBaseUrl/season2/thumbnail/t1.jpg",
        s"$imageHostBaseUrl/season2/thumbnail/t2.jpg",
        s"$imageHostBaseUrl/season2/thumbnail/t3.jpg",
        s"$imageHostBaseUrl/season2/thumbnail/t4.png",
        s"$imageHostBaseUrl/season2/thumbnail/t5.jpg",
        s"$imageHostBaseUrl/season2/thumbnail/t6.jpg",
        s"$imageHostBaseUrl/season2/thumbnail/t7.jpg",
        s"$imageHostBaseUrl/season2/thumbnail/t8.jpg",
      ),
      episodes = List(
        Episode(
          title = "01. May the Giant Be with You",
          rating = 9F,
          description = "Cooper almost died from a gunshot wound, as the waiter who found him was in no hurry to call for help. Almost unconscious, Dale sees a Giant giving him encrypted case clues. Finally, after waiting for Truman, Hawke, and Bennen, Cooper ends up in the hospital. The night in the city turned out to be intense. \n\nThe sawmill burned down. They were injured in the fire, but Shelly and Pete got out. Katherine and Josie are missing. The latter seemed to have left, but promised to return. Leo is in a coma after being injured. Ed takes care of Nadine, who has not recovered from her suicide attempt. Bobby is still in jail for drug trafficking, even though Truman thinks the guy was framed. Benjamin in the brothel was ready to have fun with the new girl, not suspecting that it was his daughter. Audrey is afraid of not getting out of her cover. Leland has turned gray and is behaving inappropriately. Maddy has concerns about the strange things going on at the Palmer house. After receiving a note from a lady with a log, Donna gets a job at Dinners on Wheels, where Laura also worked.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e1.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e01.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "02. Coma",
          rating = 8.6F,
          description = "There were 3 men with Laura at night. At the same time, neither Jacques nor Leo definitely killed her. So, the mysterious Bob becomes the main suspect. Cooper is informed of the escape of his former partner Windom Earl from a psychiatric hospital. Ronette Pulaski has come out of her coma, but is not yet able to communicate. Leo has serious injuries. Bobby persuades Shelly to take her husband home: the lovers will be able to make good money on Johnson's disability payments. \n\nBenjamin is worried about his daughter's disappearance, which Cooper also becomes aware of. Audrey tries to call for help, but Blackie and Emory stop her from doing so. Bob's portraits are everywhere. At first, Leland recognizes him, albeit vaguely, and then the image causes Ronette to have a seizure. Donna is jealous of James and Maddie. While the lovers are figuring out their relationship, Maddy runs into Bob. Donna and James come running to the girl's scream, but they fail to see the cause of the hysteria.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e2.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e02.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "03. The Man Behind the Glass",
          rating = 8.2F,
          description = "Leland tells Truman and Cooper that he knew Bob in the past, and then his name was Robertson. Nadine gets worse and is chained to the bed. Ed takes care of his wife and even finds a way to bring her to her senses. Blackie has a plan related to Audrey. The girl is drugged and they are going to get a ransom for her from Benjamin. Horn was the one who turned Blackie into a drug addict in the past, and in this way, she will take revenge on him. Donna builds bridges with agoraphobe Harold Smith, with whom Laura was also friends. \n\nSeeing Bob's image, one-armed Mike loses his temper. He takes drugs and goes in search of Bob. Cooper himself has already noticed that you can only see this \"phantom\" if you are not in perfect condition. According to James, Donna has changed a lot lately. Maddy comforts him. The touching scenes between them did not escape Donna's eyes, which caused new problems. Under hypnosis, Jacobi points to Leland as the murderer of Jacques Renault. Mr. Palmer is being arrested.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e3.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e03.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "04. Laura's Secret Diary",
          rating = 8.0F,
          description = "Norma tells her husband about the imminent arrival of critic Vance in the city. His favorable review of their establishment will greatly help the business. Hank begins to prepare for the welcome of the dear guest. When someone who matches Vance's description appears on the doorstep, Jennings steals his license and finds out that this man works for the police. Jean Reno tells Benjamin about the deplorable situation of his daughter. A ransom is demanded for Audrey, which Cooper must bring. It's a trap for Dale. The agent does not know the truth and agrees to help. He just wants to hire one of the \"Reading room Guys\" as a partner. Harry volunteers. \n\nLeland confessed to the murder of Jacques Renault. Harold has Laura's secret diary, fragments of which he read to Donna. The latter persuades Maddy to steal the recordings. Josie is back in town, and Pete informs her that Catherine is believed to have died in a fire. Jonathan, who is involved with Josie, threatens Hank. Lucy confessed to Andy about cheating. Dick (the alleged father of her child) offers his mistress money for an abortion.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e4.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e04.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "05. The Orchid's Curse",
          rating = 8.3F,
          description = "The judge, who has arrived in the city, releases Leland on bail. Leo cannot participate in the meetings in any capacity. Shelly isn't sure she wants him in her house, even if he's paralyzed. Bobby insists on getting disability benefits for Leo. Cooper found a note from Audrey and realized where the girl was being held. He and Truman secretly entered the brothel and rescued the prisoner. On the way out, the guards almost grabbed him, so Hawk, who came to the rescue, came in handy. Benjamin made a lucrative deal with a Japanese investor: a new project will be implemented on the site of the burnt-out sawmill.\n\n Andy became convinced that he could have children, which meant that he could also be the father of Lucy's child, who had already gone to an abortion clinic. Donna saw Harold getting sick as soon as he was outside. She and Maddie have devised a plan to steal Laura's diary. Harold heard a noise and caught the girls stealing. He became enraged and inflicted wounds on himself, accusing Donna of betrayal along the way.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e5.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e05.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "06. Demons",
          rating = 8.5F,
          description = "James breaks into Harold's apartment and rescues the girls. The trio escapes, but the diary remains in Smith's possession. Donna wants to tell the representatives of the guards about what happened. Leo's disability allowance is much more modest than Bobby and Shelly thought. Cooper brings Audrey to her senses. Benjamin is grateful for the rescue of his daughter and for the return of the ransom. Josie is blackmailing Horn. He risks losing all the money from the recently concluded deal. \n\nCooper's boss, Gordon Cole, arrived at Twin Peaks. He reminds the agent of the recent past and asks him not to make the same mistakes. He also provides some details regarding the investigation. Among them, there is information about an undetectable type of drug that One-armed takes. His real name is Gerard, and Mike is an entity that does not have its own body, therefore using a carrier. One-armed tells about Bob and that he has been in the city for 40 years, and now he has taken refuge in the Great Northern Hotel.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e6.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e06.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "07. Lonely Souls",
          rating = 9.4F,
          description = "The guards bring Mike to the Great Northern to search for Bob. Meanwhile, Hawke finds Harold, who has committed suicide. Next to the body is a suicide note and Laura's ruined diary. Maddie is going to return to Montana, which she tells her friends, as well as her uncle and aunt. The lady with the log gets in touch with Cooper again. Gerard loses control of his body when he is not taking medication. This allows Mike to pick up the \"remote control\". Norma is dating Nadine, who, after a coma, considers herself young and has great physical strength. \n\nShelly will have to leave her job to take care of her husband. Leo keeps saying the same thing about shoes. This clue is enough to find a tape recording in his shoes. Audrey informs her father that she knows about his management of the brothel and his relationship with Laura. Benjamin is arrested by the police. The Japanese businessman turned out to be Catherine in disguise. Leland, possessed by Bob's spirit, kills Maddie. Cooper felt that something strange was going on.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e7.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e07.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "08. Drive with a Dead Girl",
          rating = 8.5F,
          description = "James and Donna come to say goodbye to Maddie, but Leland, possessed by Bob's spirit, says that the girl has already left. He carries her corpse around the city in plastic and in a golf bag, and then leaves it in the woods. Truman and Cooper find the body. Audrey has some concerns about her father's involvement in the arrest. Benjamin can get out: on the night of Laura's murder, he had an alibi— Catherine. She is presumed dead, but Pete dispels the myth: Mrs. Martell is ready to give written testimony and save Horn in exchange for some property concessions from her lover. \n\nPete and Truman believe that Josie left town involuntarily. The sheriff does not want to let Benjamin out, although Cooper does not consider him involved in Laura's death. Leland feigns shock when he learns the latest news about the investigation of his daughter's murder. Bob is elated. The one-armed man managed to escape from police surveillance. Vivien, Norma's mother— came to Twin Peaks with her new husband Ernie, who hides that he was in prison with Hank.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e8.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e08.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "09. Arbitrary Law",
          rating = 9.3F,
          description = "Donna remembers that she had already heard the phrase from Harold's suicide note from Peter, the grandson of Mrs. Tremond, to whom she brought lunch. Going to their house with Cooper, Donna finds only a letter with the end of Laura's diary. James gave his sweetheart a ring. But as soon as he found out about Maddie's death, the guy's plans changed, and, to Donna's disappointment, he left town. \n\nAndy wants to meet Dick in person, as Lucy admits that either of them could be the father of her child. Katherine visits Benjamin in prison in the garb of a Japanese investor, and Horn signs over the sawmill to her, hoping in return to get an alibi for the night of Laura's murder. Cooper is again hinted that he already has all the clues to solve the case. The agent gathers all those involved together and points to Leland as the murderer of his daughter. He confesses. Bob leaves Mr. Palmer's body, and Leland dies. It is unknown where the evil spirit has gone now.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e9.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e09.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "10. Dispute Between Brothers",
          rating = 7.8F,
          description = "For a long time, Leland, possessed by Bob's spirit, drugged Sarah to hide his identity. Now she needs to come to her senses and accept the harsh reality. Cooper is accepted by Truman into the ranks of the \"Reading Room Guys.\" The agent was preparing to leave Twin Peaks when he received charges of abuse of office and illegally crossing the border with Canada. Dale's gun and badge are taken away. Nadine is sent to high school because she still considers herself a teenager. \n\nNorma's mother turned out to be a harsh restaurant critic, who trashed her own daughter's establishment. Hank brings Jean and Ernie together. The trio is planning a new profitable business. Audrey finds out about the death of Dale's lover. Shelly notices that Leo can move. Bobby tried to get close to Benjamin, but he didn't succeed. Josie returns and asks Harry for help. The sheriff also listens to Catherine's confession. Major Briggs invited Cooper to go fishing. During the outing, they talked a lot about the \"white lodge.\" While Cooper is distracted, the major disappears.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e10.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e10.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "11. Masked Ball",
          rating = 7.4F,
          description = "According to Briggs' wife, he had disappeared before, and this was due to military secrecy. Josie tells Harry about Thomas Eckhart: in the past, it was he who \"picked up\" Josie from the street and made her his \"property\". The widow believes that Thomas may be involved in her husband's death. Catherine agrees to take a relative in for a while, but only as a maid. In addition, it turns out that Andrew is alive. Nadine had her eye on high school student Mike Nelson at school. \n\nCooper's former colleague changed his gender and turned from Denis to Denise. First, she promises Dale help, and then informs him that his situation is deplorable. Gordon had previously warned Cooper about the danger. And Windom Earle sends his ex-partner a threatening tape. Hank informs Benjamin that Jean Reno is now running the brothel. James gets a job with Evelyn Marsh. Douglas Milford marries Lana Budding, to the displeasure of his brother Dwayne, the mayor of Twin Peaks.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e11.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e11.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "12. The Black Widow",
          rating = 7.4F,
          description = "Cooper is looking for real estate in the area and visits a ranch with a realtor. There, the suspended agent finds traces of cocaine. He believes that the chain of events leads to accusations against him, so he connects Denise. She uses Audrey's stolen photos from her father's office to get Ernie to cooperate. Benjamin had previously hired Bobby to spy on Hank. Ed and Norma reminisce about their recent (albeit secret) past together and dream of making plans for the future. Hank sees them together. James and Evelyn grow closer. \n\nDouglas died on their wedding night, and Dwayne blames Lana for what happened. Dick took charge of Nikki's orphan. And now he suspects the boy of involvement in the death of his parents. Andy helps to sort out these intricacies. Nadine persistently seeks Mike's attention. The guy even asks Donna to tell everyone that they are back together in order to avoid Nadine's intrusive and inappropriate courtship. Donna refuses. Major Briggs returns home as suddenly as he disappeared.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e12.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e12.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "13. Checkmate",
          rating = 7.7F,
          description = "Major Briggs is trying to formulate what he saw while he was away. He is sure that the military is unofficially looking for a \"white lodge.\" There were strange scars behind Briggs' ear. The major does not have time to finish his story: he and Cooper are interrupted by people in uniform. Harry is worried about Josie, who works as a maid at Catherine's house. Donna was able to find the address of Evelyn's house, where James lives and works. Hank beat Ed up. The latter was saved only by the appearance of Nadine. Benjamin plunged headlong into a fantasy world and lost touch with the outside world. Audrey has to contact Uncle Jerry to get him to step in. \n\nCooper, along with the sheriff and his deputies, is hunting for Jean Renault. The criminal intercepts the initiative, and Denise helps out the guards. Someone set up a blackout in the city. At the time of the emergency, a corpse appeared at the sheriff's desk at the police station, pointing at the chessboard. In such a spectacular way, Windom Earle made his move. Leo came to his senses, which horrified Shelly.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e13.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e13.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "14. Double Play",
          rating = 7.6F,
          description = "Leo tried to kill Shelly. Bobby stood up for her. The guy had no luck in the fight, until Shelly stabbed her husband, and Leo was forced to flee. Nadine completely switched to Mike, and Hank was back behind bars, so Norma and Ed had a chance for a full-fledged relationship. Evilyn's husband is killed in an accident. James was fixing his car. The guy realized that he was being framed. Cooper suspects Josie of murder. Thomas Eckhardt is coming to town. The mayor wanted to deal with Douglas' widow, as he blames her for his brother's death, but instead falls in love with Lana. \n\nCooper is still retired and can fully engage in the search for Windom Earl in the company of Harry, who is only happy to cooperate with him. Dale says that Caroline, Windom's wife, was a witness in a murder case, and then she became a victim herself. Cooper let his guard down then, but now he's sure that both crimes were the work of Windom, who went crazy. Leo finds himself in the woods, where he finds a cabin and meets Earl there.…",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e14.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e14.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "15. Slaves and Masters",
          rating = 7.3F,
          description = "Audrey, with the help of close friends and family, arranges a performance to bring Benjamin back to his senses. The plan is working. Shelly and Bobby tell the sheriff about Leo's attack, his escape, and the night at the sawmill when Hank shot Johnson. Nadine is not against Ed and Norma's relationship, as she is now only interested in Mike. Harry asks Josie about the circumstances of Jonathan's death. Thomas Eckhart, who has arrived in Twin Peaks, does not hide his goals: he intends to take Josie with him. Catherine is very pleased with this news. \n\nJames wants to know why Evelyn is framing him. Malcolm is planning to kill James. Evelyn's feelings for the guy overpower the original idea, and she shoots Malcolm. Leo became a hostage in Windom's apartment. Johnson wears an electric collar around his neck. Earl makes the next move in his dangerous game with Cooper. Dale finds a message from a former partner and knows that he will have to respond.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e15.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e15.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "16. The Condemned Woman",
          rating = 7.8F,
          description = "Benjamin is fighting for the ecology of the city, hoping to disrupt new construction. Later, he intends to pursue a political career. Nadine asks her husband for a divorce. He is only happy and immediately makes an offer to Norma. But Hank is ready to end his marriage with his wife only in exchange for her testimony. Norma refuses to help. Earlier, Hank wanted to negotiate a deal with Harry: he promised not to hand over Josie, who allegedly killed both Jonathan and Andrew. James is not ready to return to Twin Peaks. Donna, Shelly and Audrey receive strange messages. Norma's sister is coming to town soon. Audrey meets a certain John at the reception, who claims that they have seen each other in the past. \n\nCooper and Harry go to the meeting place of Josie and Thomas. Eckhart is seriously injured and dies right in the hotel. Josie shot at him. Her crimes are obvious (including shooting Cooper). Josie is also dying for unknown reasons. And Cooper knows that Bob was involved.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e16.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e16.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "17. Wounds and Scars",
          rating = 7.4F,
          description = "Harry becomes depressed after Josie's death: he doesn't understand how he could have ignored what she was doing. Cooper needs time and effort to get his buddy back on track. Annie, Norma's sister who escaped from the convent, starts working in a cafe. Dale and Annie clearly like each other. Ed and Nadine attend Dr. Jacobi's sessions. The Great Northern Hotel is hosting a charity event to save the weasels. However, the animal that broke free spoils the holiday. Audrey gets closer to John Wheeler. The lady with the log and Briggs show similar scars. \n\nEarl comes to Donna's house in makeup and introduces himself as a friend of her father's and delivers a message — a chess piece. Cooper publishes his retaliatory move in the newspaper. Windom is furious as the game leads to a draw. Pete helps Dale with the moves, but he notices that 6 pawns will have to be sacrificed (probably 6 people). Jones, who worked for Eckhardt, also leaves a gift in the box, only this time to Catherine. And then Jones goes to meet Harry.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e17.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e17.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "18. On the Wings of Love",
          rating = 8.0F,
          description = "Jones tried to strangle Harry, who fought back. Cooper's version: it was a delayed revenge from the already dead Thomas for the sheriff's affair with Josie. Harry got a bonsai from his ex-lover. In fact, Windom sent the gift by placing a listening device there. Gordon Cole had come to warn Dale about Briggs and Earl's past collaboration on the Blue Book project, and they were both interested in the wigwams. Cole reinstates Cooper. Besides, Gordon is surprised that he can hear Shelly without a hearing aid. \n\nDonna is following the next meeting between her mother and Benjamin and is going to find out the reason for the increased frequency of dates. Windom has set his sights on killing the winner of a local beauty contest. Annie had already seen the signs that had appeared on Briggs and the lady with the log. Cooper and company go to the Owl Cave to find them. Later, Earl comes there, and learns much more than his predecessors.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e18.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e18.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "19. Variations on Relations",
          rating = 7.9F,
          description = "Cooper and his company visited the Owl Cave again. Dale guessed that Windom had been here. Earl lures the musician to his place and makes him the next victim in a chess game, after telling him part of the story about the \"wigwam\". Mike is happy with Nadine. Bobby is jealous of Shelly and Gordon. Lucy is unhappy with Dick's behavior, who has received the right to conduct a wine tasting at the Great Northern. Donna doesn't believe her mother's answers about her relationship with Benjamin. \n\nWhile spending time with Annie, Dale hears familiar poems: Windom sent them to Caroline in the past. Donna, Shelly and Audrey also received parts of the work written by Leo's hand. Pete accidentally discovered the puzzle that Thomas had given Katherine. There was another box inside. Lara asks the mayor to make her the winner of a beauty contest. Cooper and Truman find the musician who was killed by Earl with a note saying that the next time someone close to Dale will suffer.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e19.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e19.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "20. The Path to the Black Lodge",
          rating = 8.2F,
          description = "John has to leave for Brazil in a hurry and is unlikely to return. Audrey catches up with him at the airport, they have sex on the plane, and then break up. Donna found her birth certificate, where there is a dash in the father column. Leo tried to escape, but only electrocuted himself to Windom's delight. Shelly and Bobby have restored their relationship. Catherine, accompanied by her brother, opened the next box. And inside they found another one, now metal. \n\nThe number of beauty contest participants is increasing. Cooper receives a warning from the giant, but is unable to decipher it yet. The major obtained a recording of Earl's report on the search for the wigwam. Later, Windom intercepts Briggs, drugs him, and asks him how to find the entrance to the lodge. The images in the Owl Cave turn out to be a map. Cooper decided that Earl's real purpose in coming to Twin Peaks was the black lodge. Bob appears in the flesh in the forest.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e20.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e20.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "21. Miss Twin Peaks",
          rating = 8.5F,
          description = "Leo couldn't free himself, but he released the major, as he wants to warn Shelly about the danger that threatens her. Escape and betrayal anger the returning Windom. He hangs a spider cage over Leo's head and puts a rope in his teeth. As soon as the prisoner gets tired, he will let go of the rope, the cage will fall on his head, and the unfortunate will be bitten. \n\nWhile under the influence of drugs, Briggs was still able to formulate clues for Cooper: love and fear would pave the way to the wigwam. Bob is attracted to the same combination of feelings. Donna learns that Benjamin Horn may be her father. Catherine was able to get a small key out of the last box. Earl disguised himself as a lady with a log and came to the contest, where Annie was declared the winner. Windom caused a blackout and used smoke bombs to kidnap the girl. Cooper finds himself in the role of catching up.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e21.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e21.TwinPeaks.top.mp4"
        ),
        Episode(
          title = "22. Beyond Life and Death",
          rating = 9.2F,
          description = "During the crush at the beauty contest, Mike and Nadine were injured. He was so scared for his beloved that he realized how much he loved her. She can't figure out who this guy is, and asks her husband to go home as soon as possible: Nadine's amnesia has passed. Audrey holds a picket at the bank. Andrew and Pete arrive with Katherine's stolen key. They open the cell and see a bomb with a mocking note. The vault is blowing up. Donna is packing up, as she is tired of living a lie. Briggs receives a message from Sarah Palmer. Bobby proposed to Shelly. \n\nCooper follows Earl and Annie to the entrance of the black lodge. Inside, he encounters images of many people who are no longer alive. Bob controls Windom's body and takes his soul. Cooper offers himself in exchange for Annie. A doppelganger comes out of the wigwam, Dale's evil doppelganger, but no one notices. In the hotel, the reflection in the mirror is not of the agent, but of Bob.",
          thumbnailUrl = s"$imageHostBaseUrl/season2/episode/e22.jpg",
          videoUrl = "https://v.twinpeaks.top/Twin.Peaks.s02e22.TwinPeaks.top.mp4"
        ),
      ),
      actors = List(
        Actor(
          name = "Kyle MacLachlan",
          character = "Special Agent Dale Cooper",
          thumbnailUrl = "https://upload.wikimedia.org/wikipedia/ru/thumb/5/50/Agentdalecooper.jpg/330px-Agentdalecooper.jpg",
        ),
        Actor(
          name = "Sheryl Lee",
          character = "Laura Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/92/Laura_Palmer_%281989%29.jpg/revision/latest?cb=20180219220542",
        ),
        Actor(
          name = "Lara Flynn Boyle",
          character = "Donna Hayward",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/8/85/Donna_LFB.jpg/revision/latest?cb=20221026174227",
        ),
        Actor(
          name = "James Marshall",
          character = "James Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/66/Jamesnew.jpg/revision/latest?cb=20161026024503",
        ),
        Actor(
          name = "Sherilyn Fenn",
          character = "Audrey Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/98/AudreyNew.jpg/revision/latest?cb=20161026025355",
        ),
        Actor(
          name = "Richard Beymer",
          character = "Benjamin Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/fa/Ben_001.jpg/revision/latest?cb=20100419234934",
        ),
        Actor(
          name = "David Patrick Kelly",
          character = "Jerry Horne",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/5/54/Jerryhornedpk.jpg/revision/latest?cb=20160511122515",
        ),
        Actor(
          name = "Michael Ontkean",
          character = "Sherrif Harry S. Truman",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/c/c7/HarryNew.jpg/revision/latest?cb=20161026022237",
        ),
        Actor(
          name = "Kimmy Robertson",
          character = "Lucy Moran",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/47/LucyNewAgain.jpg/revision/latest?cb=20161026023511",
        ),
        Actor(
          name = "Harry Goaz",
          character = "Andy Brennan",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/72/AndyNew.jpg/revision/latest?cb=20161026025038",
        ),
        Actor(
          name = "Michael Horse",
          character = "Hawk",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/a/a1/DeputyHawkAtTheDiner.jpg/revision/latest?cb=20160925005033",
        ),
        Actor(
          name = "Miguel Ferrer",
          character = "Albert Rosenfield",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/e/e6/AlbertRosenfeld.jpg/revision/latest?cb=20100330010337",
        ),
        Actor(
          name = "David Lynch",
          character = "Gordon Cole",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/7a/GordonColeNewMainPhoto.png/revision/latest?cb=20171109180605",
        ),
        Actor(
          name = "Mädchen Amick",
          character = "Shelly Johnson",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/66/Shelly_Johnson.png/revision/latest?cb=20230321101316",
        ),
        Actor(
          name = "Dana Ashbrook",
          character = "Bobby Briggs",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/98/BobbyHiRes.jpg/revision/latest?cb=20161101195815",
        ),
        Actor(
          name = "Eric Da Re",
          character = "Leo Johnson",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/a/a7/Leo_Johnson.jpg/revision/latest?cb=20161025123520",
        ),
        Actor(
          name = "Everett McGill",
          character = "Ed Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/3c/BigEdNewPic.jpg/revision/latest?cb=20170524152240",
        ),
        Actor(
          name = "Wendy Robie",
          character = "Nadine Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/4b/NadineNew.jpg/revision/latest?cb=20161026023639",
        ),
        Actor(
          name = "Peggy Lipton",
          character = "Norma Jennings",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f3/Norma14214.jpg/revision/latest?cb=20161030052435",
        ),
        Actor(
          name = "Chris Mulkey",
          character = "Hank Jennings",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/f/f5/HankHiRes2.jpg/revision/latest?cb=20161101201553",
        ),
        Actor(
          name = "Grace Zabriskie",
          character = "Sarah Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/30/Sarah_007.png/revision/latest?cb=20170711230313",
        ),
        Actor(
          name = "Ray Wise",
          character = "Leland Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/c/cd/LelandPalmer.jpg/revision/latest?cb=20160816065237",
        ),
        Actor(
          name = "Russ Tamblyn",
          character = "Dr. Lawrence Jacoby",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/6f/JacobyNew.jpg/revision/latest?cb=20161025125112",
        ),
        Actor(
          name = "Joan Chen",
          character = "Josie Packard",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/8/8b/JosieNew.jpg/revision/latest?cb=20161026022344",
        ),
        Actor(
          name = "Jack Nance",
          character = "Pete Martell",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/3d/Pete_Martell.jpg/revision/latest?cb=20170822052012",
        ),
        Actor(
          name = "Piper Laurie",
          character = "Catherine Martell",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/b/ba/Catherine_Martell_Infobox.jpg/revision/latest?cb=20231015113852",
        ),
        Actor(
          name = "Frank Silva",
          character = "BOB",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/37/KillerBob.jpg/revision/latest?cb=20100423043335",
        ),
        Actor(
          name = "Michael J. Anderson",
          character = "The arm (The Man from Another Place)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/0/0f/MFAPsitting.jpg/revision/latest?cb=20100709031955",
        ),
        Actor(
          name = "Al Strobel",
          character = "Mike (The one-armed man)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/d/d4/MikeDream.jpg/revision/latest?cb=20100911201926",
        ),
        Actor(
          name = "Catherine E. Coulson",
          character = "Margaret Lanterman (Log Lady)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/68/Logladyreplacement.jpg/revision/latest?cb=20160906170235",
        ),
      )
    )
      .asJson
