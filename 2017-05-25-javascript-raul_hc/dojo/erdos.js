export default erdos_number


function sum(
  a,
  b,
) {
  return a + b
}

function erdos_number(pubs, author) {
  if (pubs[0].authors.length === 1)
    return 0;
  if (!pubs[0].authors.includes(author))
    return Infinity
  return 1;

  // let authorsHash = {};

  // pubs.forEach(function(element) {

  // });
}