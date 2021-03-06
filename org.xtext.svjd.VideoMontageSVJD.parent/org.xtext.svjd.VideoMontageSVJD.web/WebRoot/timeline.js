function createTimeLine() {
  let elements = Array.from(document.getElementsByClassName("ace_line"));
  let timeLineVideo;
  const listAllElement = [];
  let durationUnknown = "unknown";
  elements.forEach((el) => {
    if (el.outerText.match(new RegExp("timeline."))) {
      timeLineVideo = el.outerText.split(" ").filter((el) => el !== "");
    }
    let arrayElementChild = [];
    let i = 0;
    el.childNodes.forEach((child) => {
      let childReplaceUselessCharacters;
      parseInt(child.textContent)
        ? (childReplaceUselessCharacters =
            el.childNodes[i - 1].textContent + "" + child.textContent)
        : (childReplaceUselessCharacters = child.textContent);
      childReplaceUselessCharacters = childReplaceUselessCharacters
        .replace("{", "")
        .replace("}", "")
        .replace(/\s+/g, "");
      if (childReplaceUselessCharacters !== "") {
        arrayElementChild.push(childReplaceUselessCharacters);
      }
      i++;
    });
    listAllElement.push(arrayElementChild);
  });
  console.log(listAllElement);
  var dateNow = new Date(Date.now()).toISOString().split("T")[0];

  let listObject = [];
  for (let i = 0; i < listAllElement.length; i++) {
    if (listAllElement[i][1] === "Title") {
      let videoObject = {
        type: "Title",
        name: listAllElement[i][2],
        duration: parseInt(listAllElement[i + 1][1]),
      };
      listObject.push(videoObject);
    }
    if (listAllElement[i][1] === "video") {
      let subtitleObject = {
        type: "video",
        name: listAllElement[i][2],
        path: listAllElement[i][4],
        duration: 15,
      };
      listObject.push(subtitleObject);
    }
  }
  console.log(listObject);
  var timeLineElement = [];
  for (let i = 0; i < listObject.length; i++) {
    if (listObject[i].type === "Title") {
      let duration = parseInt(listObject[i].duration);
      timeLineElement.push({
        id: i,
        content: listObject[i].name,
        duration: duration,
        start: dateNow + "T" + convertToGoodFormat(duration),
      });
    }
    if (listObject[i].type === "video") {
      timeLineElement.push({
        id: i,
        content: listObject[i].name,
        duration: durationUnknown,
        start: dateNow + "T" + convertToGoodFormat(120),
      });
    }
  }

  let time = 0;
  timeLineVideo.forEach((elementVideo) => {
    timeLineElement.forEach((element) => {
      if (element.content === elementVideo) {
        element.start = dateNow + "T" + convertToGoodFormat(time);
        element.content +=
          ", durée : " +
          (element.duration === durationUnknown
            ? "non connue"
            : secondsToHms(element.duration));
        element.duration === durationUnknown
          ? (element.duration = 120)
          : element.duration;
        time += element.duration;
      }
    });
  });

  console.log(timeLineElement);
  var container = document.getElementById("timeline");
  // Create a DataSet (allows two way data-binding)
  var items = new vis.DataSet(timeLineElement);
  // Configuration for the Timeline
  var options = { editable: false };
  // Create a Timeline
  if (document.getElementById("timeline").childNodes.length === 0) {
    var timeline = new vis.Timeline(container, items, options);
  } else {
    document.getElementById("timeline").innerHTML = "";

    var timeline = new vis.Timeline(container, items, options);
  }
}

function convertToGoodFormat(duration) {
  // Hours, minutes and seconds
  var hrs = ~~(duration / 3600);
  var mins = ~~((duration % 3600) / 60);
  var secs = ~~duration % 60;

  // Output like "1:01" or "4:03:59" or "123:03:59"
  var ret = "";
  if (hrs === 0 && mins === 0) {
    ret = "0" + hrs + ":" + "0" + mins + ":" + (secs < 10 ? "0" : "") + secs;
    return ret;
  }
  if (hrs === 0 && mins > 0) {
    ret +=
      "0" +
      hrs +
      ":" +
      (mins < 10 ? "0" : "") +
      mins +
      ":" +
      (secs < 10 ? "0" : "") +
      secs;
    return ret;
  }

  if (hrs > 0) {
    ret += (hrs < 10 ? "0" : "") + hrs + ":" + (mins < 10 ? "0" : "");
  }

  ret += mins + ":" + (secs < 10 ? "0" : "");
  ret += (secs < 10 ? "0" : "") + secs;
  return ret;
}

function secondsToHms(d) {
  d = Number(d);
  var h = Math.floor(d / 3600);
  var m = Math.floor((d % 3600) / 60);
  var s = Math.floor((d % 3600) % 60);

  var hDisplay = h > 0 ? h + (h == 1 ? " heure, " : " heures, ") : "";
  var mDisplay = m > 0 ? m + (m == 1 ? " minute, " : " minutes, ") : "";
  var sDisplay = s > 0 ? s + (s == 1 ? " seconde" : " secondes") : "";
  return hDisplay + mDisplay + sDisplay;
}
