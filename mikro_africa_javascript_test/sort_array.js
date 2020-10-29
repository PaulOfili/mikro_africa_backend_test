data = [
    {
        "name": "test 10",
        "country": "USA",
        "code": 12
    },
    {
        "name": "test 10",
        "country": "USA",
        "code": 1
    },
    {
        "name": "test 10",
        "country": "USA",
        "code": 44
    },
    {
        "name": "test 4",
        "country": "Nigeria",
        "code": 200
    }
];

const comparator = (a, b) => {
    
    if (a.code < b.code) {
        return 1;
    }
    else if (a.code > b.code) {
        return -1;
    }

    if (a.country < b.country) {
        return 1;
    }
    else if (a.country > b.country) {
        return -1;
    }

    if (a.name < b.name) {
        return 1;
    }
    else if (a.name > b.name) {
        return -1;
    }
    return 0;
}
sorted_data = data.sort(comparator);

console.log(sorted_data);