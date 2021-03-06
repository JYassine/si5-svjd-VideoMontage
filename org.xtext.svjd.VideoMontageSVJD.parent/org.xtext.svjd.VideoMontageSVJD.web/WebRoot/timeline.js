function createTimeLine() {
  let elements = Array.from(document.getElementsByClassName("ace_line"));

  const listAllElement = [];
  elements.forEach((el) => {
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
  /*var nonDatedata = [
    { date: dateNow + "T06:00:00", name: "clip1a" },
    { date: dateNow + "T08:00:00", name: "clip1b" },
    { date: dateNow + "T06:15:00", name: "s11" },
    { date: dateNow + "T09:00:00", name: "s2" },
    { date: dateNow + "T04:00:00", name: "s3" },
  ];*/

  let listObject = [];
  for (let i = 0; i < listAllElement.length; i++) {
    if (listAllElement[i][1] === "Clip") {
      let videoObject = {
        type: "Clip",
        name: listAllElement[i][2],
        start: parseInt(listAllElement[i + 1][1]),
        end: parseInt(listAllElement[i + 2][1]),
        duration: Math.abs(
          parseInt(listAllElement[i + 2][1]) -
            parseInt(listAllElement[i + 1][1])
        ),
        reference: listAllElement[i + 3][2],
      };
      listObject.push(videoObject);
    }
    if (listAllElement[i][1] === "Title") {
      let videoObject = {
        type: "Title",
        name: listAllElement[i][3],
        duration: parseInt(listAllElement[i + 1][1]),
      };
      listObject.push(videoObject);
    }
    if (listAllElement[i][0] === "Subtitle") {
      let subtitleObject = {
        type: "Subtitle",
        name: listAllElement[i][2],
        moment: listAllElement[i][5],
        reference: listAllElement[i][listAllElement[i].length - 1],
      };
      listObject.push(subtitleObject);
    }
  }
  console.log(listObject);
  /*TimeKnots.draw("#timeline", nonDatedata, {
    horizontalLayout: false,
    color: "#669",
    width: 200,
    showLabels: true,
    labelFormat: "%H:%M:%S",
    dateFormat: "%H:%M:%S",
  });*/
  var timeLineElement = [];

  for (let i = 0; i < listObject.length; i++) {
    if (listObject[i].type === "Clip") {
      let duration = parseInt(listObject[i].duration);
      timeLineElement.push({
        id: i,
        content: listObject[i].name,
        start: dateNow + "T" + convertToGoodFormat(duration),
      });
    }
  }
  console.log(timeLineElement);
  var container = document.getElementById("timeline");
  // Create a DataSet (allows two way data-binding)
  var items = new vis.DataSet(timeLineElement);
  // Configuration for the Timeline
  var options = { editable: false };

  // Create a Timeline
  var timeline = new vis.Timeline(container, items, options);
}

function convertToGoodFormat(duration) {
  // Hours, minutes and seconds
  var hrs = ~~(duration / 3600);
  var mins = ~~((duration % 3600) / 60);
  var secs = ~~duration % 60;

  // Output like "1:01" or "4:03:59" or "123:03:59"
  var ret = "";
  if (hrs === 0 && mins === 0) {
    ret = "0" + hrs + ":" + "0" + mins + ":" + "" + secs;
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
  ret += secs;
  return ret;
}
