const clockContainer = document.querySelector(".time-container"),
  clockDate = clockContainer.querySelector(".date"),
  clockTime = clockContainer.querySelector(".time");

function check10(time) {
  return time < 10 ? `0${time}` : time;
}
function getTime() {
  const date = new Date();
  const year = date.getFullYear();
  const month = date.getMonth();
  const dd = date.getDate();
  const hours = date.getHours();
  const minutes = date.getMinutes();
  const seconds = date.getSeconds();
  clockDate.innerText = `${year}년 ${check10(month)}월 ${check10(dd)}일`;
  clockTime.innerText = `${check10(hours)} : ${check10(minutes)} : ${check10(seconds)}`;
}
function init() {
  getTime();
  setInterval(getTime, 1000);
}

init();
