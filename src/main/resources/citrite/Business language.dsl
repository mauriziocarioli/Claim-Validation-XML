[when]Days between {firstDate} and {secondDate} are greater than {n} =  Helper( daysBetweenDates({firstDate}, {secondDate}) > {n}  )
[when]{firstDate} is after {secondDate} = Helper( daysBetweenDates({firstDate}, {secondDate}) > 0 )
[when]{firstDate} is before {secondDate} = Helper( daysBetweenDates({firstDate}, {secondDate}) < 0 )