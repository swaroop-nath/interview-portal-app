import { Ask } from './ask.model';
import { Panelist } from './panelist.model';
import { Mode } from './mode.enum';

export class AskPanelistMapper {
    constructor(
        public ask: Ask = null,
        public panelist: Panelist = null,
        public interviewLocation: string = '',
        public mode: Mode = Mode.F2F,
        public level: string = '',
        public slotStartTiming: Date = null,
        public slotEndTiming: Date = null,
        public numSlots: number = 0,
        public comment: string = ''
    ) {}
}