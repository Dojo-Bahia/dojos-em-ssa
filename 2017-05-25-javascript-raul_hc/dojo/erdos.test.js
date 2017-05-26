import erdos_number from "./erdos"

test('erdos erdos number should be 0', () => {
    const pubs = [{
        'authors': ['pe']
    },]

    let author = "pe"

    expect(erdos_number(pubs, author)).toBe(0)
})

test('mauricio erdos number should be 1', () => {
    const pubs = [{
        'authors': ["pe", "ma"]
    }]
    expect(erdos_number(pubs, 'ma')).toBe(1)
})


test('erdos not exist', () => {
    const pubs = [{
        'authors': ["mv", "ma", "mm"]
    }]
    expect(erdos_number(pubs, 'pe')).toBe(Infinity)
})

test('erdos number should be 2', () => {
    const pubs = [{
        'authors': ["pe", "ma", "mm"]
    }, {
        'authors': ["ma", "aa"]
    }]
    expect(erdos_number(pubs,"pe")).toBe(0)
    expect(erdos_number(pubs, 'ma')).toBe(1)
    expect(erdos_number(pubs, 'aa')).toBe(2)
})