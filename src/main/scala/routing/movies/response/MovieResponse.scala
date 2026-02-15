package com.paranid5.twin_peaks_tv_server
package routing.movies.response

import routing.movies.entity.{Actor, Movie}

import cats.effect.IO
import io.circe.syntax.*
import org.http4s.Response
import org.http4s.circe.CirceEntityCodec.circeEntityEncoder
import org.http4s.dsl.io.*

def movie: IO[Response[IO]] =
  Ok:
    Movie(
      title = "Twin Peaks: Fire Walk With Me",
      year = 1992,
      durationMinutes = 195,
      rating = 7.5,
      description = "\"Twin Peaks: Fire Walk With Me\"  It is the cinematic sequel and predecessor of the \"Twin Peaks\" TV series, created by David Lynch and released in 1992. The film is a precursor to the events of the first season of the series and reveals a number of key moments related to the mysterious world of Twin Peaks and the events leading up to the murder of Laura Palmer.\n\nThe film focuses on the last days of Laura Palmer's life, her struggle with inner demons and the dark forces she feels surround her. Viewers get an in-depth look at Laura's psychological state and the causes of her suffering.\nMany family secrets related to the Palmer family are also revealed, including the dark secrets of her father Leland and Uncle Bobby. This adds new layers of complexity to the Palmer family's story and their connections to the mystical powers of Twin Peaks.",
      videoUrl = "TODO",
      wallpaperUrl = "https://cdn.theasc.com/Fire-Walk-Featured.jpg",
      scenesUrls = List(
        "https://cinephilecorner.com/wp-content/uploads/2025/10/twin-peaks-fire-walk-with-me-movie-1992-1.webp",
        "https://www.criterionforum.org/api/media/captures/768w/598D4FF0-C963-7D82-77CB-44E4D56D3783.jpg",
        "https://www.criterionforum.org/api/media/captures/768w/036F2E3C-0FDD-A98A-FEA0-C44F304864B2.jpg",
        "https://www.criterionforum.org/api/media/captures/768w/BB53C4C7-1440-FC2A-447B-487D5DF0DDC8.jpg",
        "https://www.criterionforum.org/api/media/captures/768w/7BDCD8ED-7A52-F8E9-E69D-DD9FB6E11E58.jpg",
        "https://static.wikia.nocookie.net/twinpeaks/images/c/cc/Aconvenientstore.png/revision/latest?cb=20170706193528",
        "https://twinpeaksgazette.com/wp-content/uploads/2017/07/jumping-man.png",
        "https://i.guim.co.uk/img/media/5b3be27ad8fa673667365dd56ed7cd83909354ee/124_266_2390_1434/master/2390.jpg?width=445&dpr=1&s=none&crop=none",
        "https://www.criterionforum.org/api/media/captures/768w/EA76DF26-A9D3-4AB6-31D8-B5A17F43CA72.jpg",
        "https://goatfilmreviews.com/wp-content/uploads/2020/03/twinpeaksfirewalkwithme1992c.jpg",
        "https://www.cinelapsus.com/wp-content/uploads/2017/01/Schermata-2017-01-21-alle-15.22.37-931x500.png",
        "https://grantland.com/wp-content/uploads/2012/08/grant_e_fwwm151_64011.jpg",
        "https://preview.redd.it/just-let-me-be-delusional-okay-v0-k80enlei78tc1.jpeg?auto=webp&s=68ca4600ffbd2ab7af14993abd320a10007c645b",
        "https://preview.redd.it/in-twin-peak-fire-walk-with-me-1992-a-horse-magically-v0-vtkb68cl9pna1.jpg?auto=webp&s=852a81a80eac09232ba68acbdc555f2b2c103ea1",
        "https://static.wikia.nocookie.net/twinpeaks/images/3/31/Road_rage.jpg/revision/latest?cb=20180219220544",
        "https://www.criterionforum.org/api/media/header/headerphoto7358211.jpg",
        "https://wondersinthedark.wordpress.com/wp-content/uploads/2010/04/firewalk3.jpg",
      ),
      actors = List(
        Actor(
          name = "Sheryl Lee",
          character = "Laura Palmer",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/9/92/Laura_Palmer_%281989%29.jpg/revision/latest?cb=20180219220542",
        ),
        Actor(
          name = "Kyle MacLachlan",
          character = "Special Agent Dale Cooper",
          thumbnailUrl = "https://upload.wikimedia.org/wikipedia/ru/thumb/5/50/Agentdalecooper.jpg/330px-Agentdalecooper.jpg",
        ),
        Actor(
          name = "Moira Kelly",
          character = "Donna Hayward",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/74/Donna_Hayward_%28February_1989%29.jpg/revision/latest?cb=20180219221233",
        ),
        Actor(
          name = "James Marshall",
          character = "James Hurley",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/66/Jamesnew.jpg/revision/latest?cb=20161026024503",
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
          name = "David Bowie",
          character = "Phillip Jeffries",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/6b/Phillip_Jeffries.jpg/revision/latest?cb=20170820225844",
        ),
        Actor(
          name = "David Lynch",
          character = "Gordon Cole",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/7/7a/GordonColeNewMainPhoto.png/revision/latest?cb=20171109180605",
        ),
        Actor(
          name = "Miguel Ferrer",
          character = "Albert Rosenfield",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/e/e6/AlbertRosenfeld.jpg/revision/latest?cb=20100330010337",
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
          name = "Heather Graham",
          character = "Annie Blackburn",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/1/14/Annie_Blackburn.jpg/revision/latest?cb=20190921214308",
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
          name = "Catherine E. Coulson",
          character = "Margaret Lanterman (Log Lady)",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/6/68/Logladyreplacement.jpg/revision/latest?cb=20160906170235",
        ),
        Actor(
          name = "Frank Silva",
          character = "BOB",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/3/37/KillerBob.jpg/revision/latest?cb=20100423043335",
        ),
        Actor(
          name = "Michael J. Anderson",
          character = "The arm",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/0/0f/MFAPsitting.jpg/revision/latest?cb=20100709031955",
        ),
        Actor(
          name = "Al Strobel",
          character = "Mike",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/d/d4/MikeDream.jpg/revision/latest?cb=20100911201926",
        ),
        Actor(
          name = "Frances Bay",
          character = "Mrs. Tremond",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/a/a4/Mrs._Tremond.jpg/revision/latest?cb=20170906093329",
        ),
        Actor(
          name = "Pierre Tremond",
          character = "Mrs. Tremond",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/4/4a/Pierre_%28Fire_Walk_with_Me%29.jpg/revision/latest?cb=20180220025446",
        ),
        Actor(
          name = "Carlton Lee Russell",
          character = "Jumping man",
          thumbnailUrl = "https://static.wikia.nocookie.net/twinpeaks/images/b/b4/Jumpingman.jpg/revision/latest?cb=20170906093839",
        ),
      )
    )
      .asJson
